package board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BoardDBBean {
	private static BoardDBBean instance = new BoardDBBean();
	public static BoardDBBean getInstance() {
		return instance;
	}
	private BoardDBBean() {
		
	}
	private Connection getConnection() throws Exception{
		String jdbcDriver = "jdbc:apache:commons:dbcp:/pool";
		return DriverManager.getConnection(jdbcDriver);
	}
	//writePro.jsp
	public void insertArticle(BoardDataBean article) throws Exception{
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		//답변글인지 일반글인지 구분해서 입력시켜주는로직
		int num = article.getNum();
		int ref= article.getRef();
		int re_step= article.getRe_step();
		int re_level= article.getRe_level();
		int number = 0;
		String sql = "";
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement("select max(num) from board");
			rs = pstmt.executeQuery();
			if(rs.next())
				number=rs.getInt(1)+1;
			else
				number=1;
			if(num!=0) {
				sql="update board set re_step=re_step+1 where ref=?and re_step> ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, ref);
				pstmt.setInt(2,  re_step);
				pstmt.executeUpdate();
				re_step=re_step+1;
				re_level=re_level+1;
			}else {
				ref=number;
				re_step=0;
				re_level=0;
			}
			sql = "insert into board(num,writer,email,subject,passwd,reg_date,";
			sql += "ref,re_step,re_level,content,ip) values(board_num.NEXTVAL,?,?,?,?,?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, article.getWriter());
			pstmt.setString(2,  article.getEmail());
			pstmt.setString(3,  article.getSubject());
			pstmt.setString(4, article.getPasswd());
			pstmt.setTimestamp(5, article.getReg_date());
			pstmt.setInt(6, ref);
			pstmt.setInt(7, re_step);
			pstmt.setInt(8, re_level);
			pstmt.setString(9,  article.getContent());
			pstmt.setString(10,  article.getIp());
			pstmt.executeUpdate();
		}catch(Exception ex) {
			ex.printStackTrace();
		}finally {
			if(rs!= null)
				try {rs.close();}catch(SQLException ex) {}
			if(pstmt != null)try {pstmt.close();}catch(SQLException ex) {}
			if(conn != null) try {conn.close();}catch(SQLException ex) {}
		}
		
		
	}
	//list.jsp 페이징을 위헤서 전체 DB에 입력되 행의수가 필요하다 
	public int getArticleCount() throws Exception{
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int x = 0;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement("selelct count(*) from board");
			rs = pstmt.executeQuery();
			if(rs.next()) {
				x=rs.getInt(1);
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}finally {
			if(rs!= null)
				try {rs.close();}catch(SQLException ex) {}
			if(pstmt != null)try {pstmt.close();}catch(SQLException ex) {}
			if(conn != null) try {conn.close();}catch(SQLException ex) {}
		}return x;
	}
	
	//list.jsp -> Paging! DB로부터 여러행을 결과로 받는다
	public List getArticles(int start, int end) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List articleList = null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(
					"select num,writer,email,subject,passwd,reg_date,ref,re_step,re_level,content,ip,readcount,r "
							+ "from (select num,writer,email,subject,passwd,reg_date,ref,re_step,re_level,content,ip,readcount,rownum r"
							+ "from (select num,writer,email,subject,passwd,reg_date,ref,re_step,re_level,content,ip,readcount "
							+ "from board order by ref desc,re_step asc) order by ref desc, re_step asc) where r >= ? and r <= ?");
			pstmt.setInt(1, start);
			pstmt.setInt(2, end);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				articleList = new ArrayList(end);
				do {
					BoardDataBean article = new BoardDataBean();
					article.setNum(rs.getInt("num"));
					article.setWriter(rs.getString("writer"));
					article.setEmail(rs.getString("email"));
					article.setSubject(rs.getString("subject"));
					article.setPasswd(rs.getString("passwd"));
					article.setReg_date(rs.getTimestamp("reg_date"));
					article.setReadcount(rs.getInt("readcount"));
					article.setRef(rs.getInt("ref"));
					article.setRe_step(rs.getInt("re_step"));
					article.setRe_level(rs.getInt("re_level"));
					article.setContent(rs.getString("content"));
					article.setIp(rs.getString("ip"));
					articleList.add(article);
				} while (rs.next());
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (SQLException ex) {
				}
			if (pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException ex) {
				}
			if (conn != null)
				try {
					conn.close();
				} catch (SQLException ex) {
				}
		}return articleList;
	}
	//read.jsp DB로부터 한줄의 데이터를 가져온다
	public BoardDataBean getArticle(int num)throws Exception{
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		BoardDataBean article = null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement("update board set readcount=readcount+1 where num =?");
			pstmt.setInt(1,num);
			pstmt.executeUpdate();
			pstmt = conn.prepareStatement("select * from board where num = ?");
			pstmt.setInt(1,num);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				article = new BoardDataBean();
				article.setNum(rs.getInt("num"));
				article.setWriter(rs.getString(("writer")));
				article.setEmail(rs.getString("email"));
				article.setSubject(rs.getString("subject"));
				article.setPasswd(rs.getString("passwd"));
				article.setReg_date(rs.getTimestamp("reg_date"));
				article.setReadcount(rs.getInt("readcount"));
				article.setRef(rs.getInt("ref"));
				article.setRe_step(rs.getInt("re_step"));
				article.setRe_level(rs.getInt("re_level"));
				article.setContent(rs.getString("content"));
				article.setIp(rs.getString("ip"));
			}
		}catch(Exception ex) {ex.printStackTrace();}
		finally {
			if (rs != null)
				try {
					rs.close();
				} catch (SQLException ex) {
				}
			if (pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException ex) {
				}
			if (conn != null)
				try {
					conn.close();
				} catch (SQLException ex) {
				}
		}
		return article;
	}
	
	
}

package sec02.ex01;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class MemberDAO {
	/*
	 * private static final String driver = "oracle.jdbc.driver.OracleDriver";
	 * private static final String url = "jdbc:oracle:thin:@localhost:1521:XE";
	 * private static final String user = "C##scott";
	 * private static final String pwd = "tiger";
	 */
	private Connection con;
	private PreparedStatement pstmt;
	private DataSource dataFactory;

	public MemberDAO() {
		// JNDI�� �����ϱ� ���� �⺻ ��� (java:/comp/env)�� �����մϴ�.
		try {
			Context ctx = new InitialContext();
			Context envContext;
			envContext = (Context) ctx.lookup("java:/comp/env");
			dataFactory = (DataSource) envContext.lookup("jdbc/oracle");
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}

	public List<MemberVO> listMembers() {
		List<MemberVO> list = new ArrayList<MemberVO>();
		try {
			// connDB();
			con = dataFactory.getConnection();
			String query = "select * from t_member ";
			System.out.println("PrepareStatement: " + query);
			pstmt = con.prepareStatement(query);

			ResultSet rs = pstmt.executeQuery();
			// ����.. ���⼭ executeQuery();���� query�� ��� �������� �ϴ� ���� �ƴ�, pstmt
			// ��ü�� ������ ��, query�� �ִ±�.
			while (rs.next()) {
				String id = rs.getString("id");
				String pwd = rs.getString("pwd");
				String name = rs.getString("name");
				String email = rs.getString("email");
				Date joinDate = rs.getDate("joinDate");
				MemberVO vo = new MemberVO();
				vo.setEmail(email);
				vo.setId(id);
				vo.setJoinDate(joinDate);
				vo.setPwd(pwd);
				vo.setName(name);
				list.add(vo);
			}
			rs.close();
			pstmt.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	/*
	 * private void connDB() {
	 * try {
	 * Class.forName(driver);
	 * System.out.println("Oracle ����̹� �ε� ����");
	 * con = DriverManager.getConnection(url, user, pwd);
	 * System.out.println("Connection ���� ����");
	 * } catch (ClassNotFoundException e) {
	 * e.printStackTrace();
	 * } catch (SQLException e) {
	 * e.printStackTrace();
	 * }
	 * }
	 */

}

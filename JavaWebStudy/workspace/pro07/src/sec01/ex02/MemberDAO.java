package sec01.ex02;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
public class MemberDAO {
	
	private static final String driver = "oracle.jdbc.driver.OracleDriver";
	private static final String url = "jdbc:oracle:thin:@localhost:1521:XE";
	private static final String user = "C##scott";
	private static final String pwd = "tiger";
	private Connection con;
	private PreparedStatement pstmt;
	
	public List<MemberVO> listMembers() {
		List<MemberVO> list = new ArrayList<MemberVO>();
		try {
		connDB();
		String query = "select * from t_member ";
		System.out.println("PrepareStatement: " + query);
		pstmt = con.prepareStatement(query);

		ResultSet rs = pstmt.executeQuery();
		//과연.. 여기서 executeQuery();에서 query를 계속 컴파일을 하는 것이 아닌, pstmt 객체를 생성할 때, query를 넣는군.
		while(rs.next()) {
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
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	private void connDB() {
		try {
			Class.forName(driver);
			System.out.println("Oracle 드라이버 로딩 성공");
			con = DriverManager.getConnection(url, user, pwd);
			System.out.println("Connection 생성 성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

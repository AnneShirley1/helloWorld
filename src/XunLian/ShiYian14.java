package XunLian;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**编程实现连接到一个本地数据库studentScore，
 * 然后显示Student表中计算机系的全部学生的学号，姓名，性别和年龄。
 * 掌握利用Acess2007建立数据库；掌握如何建立数据库表；
 * 掌握配置ODBC数据源。掌握加载JDBC驱动程序，执行SQL语句等。
 * 编程连接到本地ODBC数据源，实现常见的数据库操作。
 */
public class ShiYian14 {
    private static String driver="com.oracle.jdbc.Driver";
    private static String url="jdbc:oracle://localhost//StudentScore";
    private static String user="root";
    private static String password="2010";
    public static void main(String[] args) {
        Connection conn=null;
        Statement stmt=null;
        ResultSet rs=null;
        try
        {
            Class.forName(driver);
            System.out.println("计算机系的全部学生");
            conn= DriverManager.getConnection(url,user,password);
            String sql="SELECT no,name,age,study FROM student";
            stmt=conn.createStatement();
            rs=stmt.executeQuery(sql);
            while(rs.next())
            {
                String no=rs.getString("no");
                String name=rs.getString("name");
                int age=rs.getInt("age");
                String study=rs.getString("study");
                System.out.println(no+"  "+name+"  "+age+"  "+study);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                if(rs !=null) rs.close();
                if(stmt !=null) stmt.close();
                if(conn !=null) conn.close();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }

        }
    }
}

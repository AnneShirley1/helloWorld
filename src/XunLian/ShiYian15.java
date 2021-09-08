package XunLian;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ShiYian15 {
    private static String driver="oracle.jdbc.driver.OracleDriver";
    private static String url="jdbc:oracle:thin:@localhost:1522:tiger";
    private static String user="system";
    private static String password="Wacx2015";
    public static void main(String[] args)
    {
        Connection conn=null;
        Statement stmt=null;
        ResultSet rs=null;
        String selectSql="SELECT * FROM student";
        String insertSql="INSERT INTO student(no,name,age,study) "+ "VALUES('20180242031', '小米','18')";
        String updateSql="UPDATE student SET study='数学' WHERE no='20180242033'";
        String deleteSql="DELETE FROM student WHERE no='20180242024'";
        try
        {
            Class.forName(driver);
            conn= DriverManager.getConnection(url,user,password);
            stmt=conn.createStatement();
            rs=stmt.executeQuery(selectSql);
            while(rs.next())
            {
                String no=rs.getString("no");
                String name=rs.getString("name");
                int age=rs.getInt("age");
                String study=rs.getString("study");
                System.out.println(no+"  "+name+"  "+age+"  "+study);
            }
            int count=stmt.executeUpdate(insertSql);
            System.out.println("添加了"+count+"条记录到Student表中");
            count=stmt.executeUpdate(updateSql);
            System.out.println("修改了Student表中"+count+"条记录");
            count=stmt.executeUpdate(deleteSql);
            System.out.println("删除了Student表中"+count+"条记录");
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

package AES.Model;
// Generated May 21, 2015 1:38:17 PM by Hibernate Tools 4.3.1



/**
 * User generated by hbm2java
 */
public class User  implements java.io.Serializable {


     private Integer userid;
     private String username;
     private String password;
     private Integer usertype;

    public User() {
    }

	
    public User(String username) {
        this.username = username;
    }
    public User(String username, String password, Integer usertype) {
       this.username = username;
       this.password = password;
       this.usertype = usertype;
    }
   
    public Integer getUserid() {
        return this.userid;
    }
    
    public void setUserid(Integer userid) {
        this.userid = userid;
    }
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public Integer getUsertype() {
        return this.usertype;
    }
    
    public void setUsertype(Integer usertype) {
        this.usertype = usertype;
    }




}



package proj.amitspilman;

public class rowPassword {
    private String title;
    private String password;
    private String username;

    public  rowPassword(String title,String password,String username) {
        this.password=password;
        this.title=title;
        this.username=username;
    }

    public String getTitle(){
        return title;
    }
    public String getPassword(){
        return password;
    }
    public String getUsername(){
        return username;
    }

    public void setTitle(String title){
        this.title=title;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public void setUsername(String username){
        this.username=username;
    }


}

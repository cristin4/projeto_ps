package users;

public class User {
    private final String login;
    private String password;
    private String name;
    private int age;
    private String nickname;
    private String school;
    private String relationship;

    public User(String login, String password,String name){
        this.login = login;
        this.password = password; // Melhoria: salvar hash + input secreto
        this.name = name;
    }

    public String getLogin() {
        return this.login;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword() {
        return this.password;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
    public void setNickname(String nickname){
        this.nickname = nickname;
    }
    public String getNickname(){
        return this.nickname;
    }
    public void setSchool(String school){
        this.school = school;
    }
    public String getSchool(){
        return this.school;
    }
    public void setRelationship(String relationship){
        this.relationship = relationship;
    }
    public String getRelationship(){
        return this.relationship;
    }

}

package model;

import com.sun.javafx.binding.StringFormatter;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 14.09.2015
 * Time: 14:22
 * To change this template use File | Settings | File Templates.
 */
public class Comment {
   public String personCom;
    public String content;

    public Comment(){}

    public Comment(String personCom , String content)  {
         this.personCom= personCom;
         this.content= content;
    }

    public String getPersonCom() {
        return personCom;
    }

    public void setPersonCom(String personCom) {
        this.personCom = personCom;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


}

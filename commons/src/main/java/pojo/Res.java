package pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Res {
    public String msg;
    public int code;
    private Object data;

    public static Res success(){
        return new Res("success",200,null);
    }
    public static Res success(Object data){
        return new Res("success",200,data);
    }

    public static Res error(){
        return new Res("error",444);
    }

    public static Res error(Object data){
        return new Res("error",444,data);
    }

    public static Res error(String msg){
        return new Res(msg,444);
    }

    public Res(String msg, int code, Object data) {
        this.msg = msg;
        this.code = code;
        this.data = data;
    }
    public Res(String msg, int code) {
        this.msg = msg;
        this.code = code;
        this.data = data;
    }

    public Res(Object data) {
        this.code = 200;
        this.msg = "success";
        this.data = data;
    }
}

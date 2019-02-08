package mmadr.m1;

import lombok.Data;

@Data
public class M1 {
    private String name;

    public void hello(){
        System.out.print("hello");
    }

    public void bye(){
        System.out.print("bye");
    }
}

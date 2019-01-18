package mmadr.m2;

import lombok.Data;

@Data
public class M2 {
    private String name;

    public void hello(){
        System.out.print("hello");
    }
}

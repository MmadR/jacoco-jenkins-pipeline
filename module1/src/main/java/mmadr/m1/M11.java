package mmadr.m1;

import java.util.Optional;

public class M11 {

    public void yeah(){
        Optional.ofNullable(null).orElseGet(() -> new IllegalArgumentException("a"));
    }

}

package rpc.tomstillcoding.com.IDL.Hello;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;


@Data
@AllArgsConstructor
public class HelloResponse implements Serializable {
    private String msg;
}
package questions;

import java.io.IOException;

public class Solution1 {
    public static void main(String[] args) throws Exception {
        try {
            throw new IOException();
        }
        catch (IOException ex) {
            throw new Exception();
        }
        catch (Exception ex) {
            System.out.println("Hi There");
        }
        finally {
            System.out.println("Hello again");
        }
        System.out.println("And goodbye");
    }
}


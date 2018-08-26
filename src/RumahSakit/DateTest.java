/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RumahSakit;
import java.text.SimpleDateFormat;
import java.util.Date;
public class DateTest {

    public static void main(String[] args) {
        Date date = new Date(118, 7, 24);
        Date today = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyy/MM/dd");
        System.out.println(ft.format(today));
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ti_regpagi.latihan30.cakep;
import java.util.Scanner;
/**
 * Nama         : Ahmad Nurfaqih
 * Nim          : 22205015
 * prodi        : Teknik Informatia
 * Deskripsi    : Program ini berisi tentang kejujuran
 * @author 62895
 */
public class TI_RegPagi22205015Latihan30Cakep {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\u001b[31mKamu \u001b[32mngerjain sendiri \u001b[33mlatihan 17 sampe \u001b[latihan 30 ini? \u001b[0m");
        System.out.print("\u001b[34mJawab \u001b[31m(yoi/enggak): ");
        System.out.print("");
        
       String jawab = scanner.next();
       
       if (jawab.equals("yoi")){
           System.out.println("\n\u001b[31mCakep Bener. \u001b[35mGood Job \u001b[0m");
       } else if (jawab.equals("enggak")) {
           System.out.println("\u001b[31mTetep cakep sih.");
           System.out.println("\u001b[36mSing penting paham konsep nya yee.");
           System.out.println("Keep the code works dude");
       }

          
    }
}

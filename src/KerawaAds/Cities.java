/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KerawaAds;

/**
 *
 * @author mabian
 */
public class Cities {
     
    public String cities_in_cameroun[] = new String[]{"Bafoussan", "Bamenda", "Bertoua",
        "Buea", "Douala", "Ebolowa", "Edea",
        "Foumban", "Garoua", "Kribi", "Kumba",
        "Limbe", "Maroua", "Mbalmayo", "Ngaoudere",
        "Nkongsamba", "Tiko", "Yaounde"};

    public String cities_in_Congo_Brazza[] = new String[]{"Brazzaville", "Pointe Noire"};

    String cities_Congo_Kinshasa[] = new String[]{"Boma", "Bukavu", "Goma",
        "Kananga", "Kinshasa", "Kisangani", "Kolwezi", "Likasi",
        "Lubumbashi", "Mbuji-mayi", "Tshikapa"};

    String cities_in_cote_dlvoire[] = new String[]{"Abidjan", "Agboville", "Bouake",
        "Grand Bassam", "Korhogo", "San Pedro", "Tieme", "Touba", "Yamoussoukro"};

    String cities_in_Gabon[] = new String[]{"Koulamoutou", "Lambarene", "Libreville",
        "Maskuku", "Moanda", "Mouila", "Oyem", "Port Gentil", "Tchibanga"};

    String cities_in_Senegal[] = new String[]{"Dakar", "Diourbel", "Guediawaye",
        "Kaolack", "Kolda", "Louga", "Mbacke", "Mbour", "Pikine", "Rufisque",
        "Saint Louis", "Tambacounda", "Thies", "Touba", "Ziguinchor"};
    
    public void testMethod(int price, String tag)
    {
        System.out.println(price+" "+tag);
    }
}

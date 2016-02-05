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

    public String cities_in_cameroun[] = new String[]
    {"Bafoussan", "Bamenda",
     "Bertoua", "Buea",
     "Douala", "Ebolowa",
     "Edea",  "Foumban",
     "Garoua", "Kribi",
     "Kumba", "Limbe", 
     "Maroua", "Mbalmayo",
     "Ngaoudere","Nkongsamba",
     "Tiko", "Yaounde"};

    private final String[] city_code_in_cameroon = new String[]
    {"338", "336",
     "340", "342",
     "334", "341",
     "344", "346",
     "335", "813",
     "343", "556",
     "337", "952",
     "339", "345",
     "557", "333"
    };

    public String cities_in_Congo_Brazza[] = new String[]
    {"Brazzaville",
     "Pointe Noire"
    };
    private final String[] city_code_in_brazza = new String[]
    {"347",
     "348"
    };

    public  String cities_Congo_Kinshasa[] = new String[]
    {"Boma", "Bukavu", "Goma",
     "Kananga", "Kinshasa", "Kisangani",
     "Kolwezi", "Likasi", "Lubumbashi",
     "Mbuji-mayi", "Tshikapa"};
    
    private final String[] city_codeKin = new String[]
    {
        "356", "358", "951",
        "354", "349", "353",
        "351", "355", "350",
        "352", "357"};

   public String cities_in_cote_dlvoire[] = new String[]
    {
        "Abidjan", "Agboville",
        "Bouake", "Grand Bassam",
        "Korhogo", "San Pedro",
        "Tieme", "Touba",
        "Yamoussoukro"
    };
    private final String[] codeCote = new String[]
    {
        "359","365",
        "361","364",
        "362","363",
        "367","366",
        "360"
    };

   public String cities_in_Gabon[] = new String[]
    {
        "Koulamoutou", "Lambarene",
        "Libreville", "Maskuku",
        "Moanda", "Mouila",
        "Oyem", "Port Gentil",
        "Tchibanga"
    };

    private final  String[] codeGabon = new String[]
    {
        "626","624",
        "618","620",
        "622","623",
        "621","619",
        "625"
    };
   public String cities_in_Senegal[] = new String[]
    {
        "Dakar", "Diourbel", "Guediawaye",
        "Kaolack", "Kolda", "Louga",
        "Mbacke", "Mbour", "Pikine",
        "Rufisque", "Saint Louis",
        "Tambacounda", "Thies", "Touba",
        "Ziguinchor"
    };
    private final String[] codeSenegal = new String[]
    {
        "483","493","486",
        "488","497","494",
        "496","489","484",
        "491","490","495",
        "487","485","492"
       
    };
    public void testMethod(int price, String tag) {
        System.out.println(price + " " + tag);
    }
    public String[] currency = new String[]
    {
        "Franc FA", "euro (€)",
        "pound (£)", "Fr", "Dirhams",
        "Rs", "Nairas", "USh",
        "US dollars ($)", "CFA", "CFA",
        "R"
    };
    
    private final String[] codes = new String[]
    {
      "CDF","EUR","GBP",
      "GNF","MAD","MUR",
      "NGN","UGX","USD",
      "XAF","XOF","ZAR"
    };
    public String currencyCode(String c) {
        String cCode = "";
        for (int i = 0; i < currency.length; i++) {
            if (c.equalsIgnoreCase(currency[i])) {
                for (int y = 0; y < codes.length; y++) {
                    if (i == y) {
                        cCode = codes[y];
                    }
                }
            }
        }
        return cCode;
    }

    public String code(String country, String city) {
        String code = "";
        switch (country) {
            case "Cameroun":
                for (int i = 0; i < cities_in_cameroun.length; i++) {
                    if (city.equalsIgnoreCase(cities_in_cameroun[i])) {
                        for (int y = 0; y < city_code_in_cameroon.length; y++) {
                            if (i == y) {
                                code = city_code_in_cameroon[y];
                            }
                        }
                    }
                }
                break;
            case "Congo Brazza":
                for (int i = 0; i < cities_in_Congo_Brazza.length; i++) {
                    if (city.equalsIgnoreCase(cities_in_Congo_Brazza[i])) {
                        for (int y = 0; y < city_code_in_brazza.length; y++) {
                            if (i == y) {
                                code = city_code_in_brazza[y];
                            }
                        }
                    }
                }
                break;
            case "Congo Kinshasa":
                for (int i = 0; i < cities_Congo_Kinshasa.length; i++) {
                    if (city.equalsIgnoreCase(cities_Congo_Kinshasa[i])) {
                        for (int y = 0; y < city_codeKin.length; y++) {
                            if (i == y) {
                                code = city_codeKin[y];
                            }
                        }
                    }
                }
                break;
            case "Côte d'Ivoire":
                for (int i = 0; i < cities_in_cote_dlvoire.length; i++) {
                    if (city.equalsIgnoreCase(cities_in_cote_dlvoire[i])) {
                        for (int y = 0; y < codeCote.length; y++) {
                            if (i == y) {
                                code = codeCote[y];
                            }
                        }
                    }
                }
                break;
            case "Gabon":
                for (int i = 0; i < cities_in_Gabon.length; i++) {
                    if (city.equalsIgnoreCase(cities_in_Gabon[i])) {
                        for (int y = 0; y < codeCote.length; y++) {
                            if (i == y) {
                                code = codeGabon[y];
                            }
                        }
                    }
                }
                break;
            case "Senegal":
                for (int i = 0; i < cities_in_Senegal.length; i++) {
                    if (city.equalsIgnoreCase(cities_in_Senegal[i])) {
                        for (int y = 0; y < codeSenegal.length; y++) {
                            if (i == y) {
                                code = codeSenegal[y];
                            }
                        }
                    }
                }
                break;
                default:
                    code = "N/A";
        }
        return code;
    }

}

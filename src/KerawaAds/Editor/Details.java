
package KerawaAds.Editor;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sakwe
 */
public class Details {

    public String allDataStrings[] = new String[]{"Bafoussan", "Bamenda", "Bertoua", "Buea", "Douala", "Ebolowa",
        "Edea", "Foumban", "Garoua", "Kribi", "Kumba", "Limbe", "Maroua", "Mbalmayo", "Ngaoudere", "Nkongsamba",
        "Tiko", "Yaounde", "Abidjan", "Agboville", "Bouake", "Grand Bassam", "Korhogo", "San Pedro", "Tieme", "Touba", "Yamoussoukro", "Brazzaville",
        "Pointe Noire", "Boma", "Bukavu", "Goma", "Kananga", "Kinshasa", "Kisangani", "Kolwezi", "Likasi", "Lubumbashi", "Mbuji-mayi", "Tshikapa",
        "Abidjan", "Agboville", "Bouake", "Grand Bassam", "Korhogo", "San Pedro", "Tieme", "Touba", "Yamoussoukro", "Koulamoutou", "Lambarene",
        "Libreville", "Maskuku", "Moanda", "Mouila", "Oyem", "Port Gentil", "Tchibanga", "Dakar", "Diourbel", "Guediawaye", "Kaolack",
        "Kolda", "Louga", "Mbacke", "Mbour", "Pikine", "Rufisque", "Saint Louis", "Tambacounda", "Thies", "Touba", "Ziguinchor"

    };

    private String[] AllCOdes = new String[]{
        "338", "336", "340", "342", "334", "341", "344", "346", "335", "813", "343", "556", "337", "952", "339", "345", "557", "333", "359", "365", "361", "364",
        "362", "363", "367", "366", "360", "347", "348", "356", "358", "951", "354", "349", "353", "351", "355", "350", "352", "357", "359", "365", "361", "364",
        "362", "363", "367", "366", "360", "626", "624", "618", "620", "622", "623", "621", "619", "625", "483", "493", "486",
        "488", "497", "494", "496", "489", "484", "491", "490", "495", "487", "485", "492"

    };
    private String[] Currency_shr = new String[]{
        "CDF", "EUR", "GBP", "GNF", "MAD", "MUR", "NGN", "UGX", "USD", "XAF", "XOF", "ZAR"
    };
    private String[] currency_name = new String[]{
        "Franc FA", "euro (€)", "pound (£)", "Fr", "Dirhams", "Rs", "Nairas", "USh", "US dollars ($)", "CFA", "CFA", "R"
    };
    private String[] CatsName = new String[]{
        "Maisons - Appartements à vendre", "Autres - Automobile", "Pièces détachées - accessoires", "Motor", "Voitures"
    };
    public List getString(String str){
        List<String> list = new ArrayList<>();
    String[] allcategories = new String[]{
        str,
        "Sélectionnez une catégorie...",
"Automobile",
     " Voitures",
     " Motor",
        "Pièces détachées - accessoires",
      "Autres - Automobile",
"REAL ESTATE",
      "Maisons - Appartements à louer",
      "Maisons - Appartements à vendre",
      "Bureaux - locaux commerciaux",
      "Terrains à vendre ou à louer",
"JOBS",
      "Offres d'emploi",
      "Demandes d'emploi - CVthèque",
"FASHION ",
      "Habillement femme",
      "Habillement Homme",
      "Accessoires de mode",
      "Habillement Enfants",
      "Montres - Bijoux - Lunettes",
      "Autres articles de mode",
"TECH",
      "Audio - Video",
      "Consoles - Jeux vidéos",
      "Téléphones - tablettes tactiles",
      "Ordinateurs",
      "Autres - High Tech", 
"Autres - A vendre",
      "Mobiliers, décoration",
      "Autres Immobilier",
      "Electromenager",
"Services",   
     "Offres de service",
      "Evenementiel",
     "Recherche de services",
     "Autres - Services"
    };
    for(String s : allcategories)
    {
        list.add(s);
    }
    
    return list;
    }
    private String[] catcode = new String[]{
        "30", "121", "101", "99", "98"
    };
  public String getcatCodes(String cats){
      String code =null;
     
       for (int i = 0; i < CatsName.length; i++) {
            if (cats.equalsIgnoreCase(CatsName[i])) {
                for (int c = 0; c < catcode.length; c++) {
                    code = catcode[i];
                    if (cats.equalsIgnoreCase(catcode[c])) {
                        code = catcode[i];
                    }
                    break;
                }
            }else if (cats.equalsIgnoreCase(catcode[i])) {
                for (String citycode : CatsName) {
                    code = CatsName[i];
                }
            }

        }
      return code;
  }
    /**
     *
     * @param city
     * @param country
     * @return city code as string
     */
    public String getCities_Codes(String city, String country) {
        String city_mainCode = "";
        boolean val;
        for (int i = 0; i < allDataStrings.length; i++) {
            if (country.equalsIgnoreCase(allDataStrings[i])) {
                val = country.equalsIgnoreCase(allDataStrings[i]);
               // codecount = i;
                for (int c = 0; c < AllCOdes.length; c++) {
                    city_mainCode = AllCOdes[i];
                    if (city.equalsIgnoreCase(AllCOdes[c])) {
                        city_mainCode = AllCOdes[i];
                    }
                    break;
                }
            }
        }
        return city_mainCode;
    }

    /**
     * 
     * @param currency
     * @return 
     */
    public String getCurrency_Codes(String currency) {
        String currency_mainCode = "";
        boolean val;
        for (int i = 0; i < Currency_shr.length; i++) {
            if (currency.equalsIgnoreCase(Currency_shr[i])) {
                val = currency.equalsIgnoreCase(Currency_shr[i]);
                //System.out.println(i);
                for (String city_code_in_cameroon1 : currency_name) {
                    currency_mainCode = currency_name[i];
                    if (currency_name == null) {
                        currency_mainCode = "its not here";
                    }
                    break;
                }
            } else if (currency.equalsIgnoreCase(currency_name[i])) {
                for (String citycode : Currency_shr) {
                    currency_mainCode = Currency_shr[i];
                }
            }

        }

        return currency_mainCode;
    }

    /**
     * 
     * @param code
     * @return code of string entered
     */
    public String getCity(String code) {
        String city = "";
        for (int i = 0; i < AllCOdes.length; i++) {
            if (code.contentEquals(AllCOdes[i])) {
                for (int j = 0; j < allDataStrings.length; j++) {
                    if (i == j) {
                        city = allDataStrings[j];
                    }
                }
            }
        }
        return city;
    }
}

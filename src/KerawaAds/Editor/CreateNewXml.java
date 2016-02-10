package KerawaAds.Editor;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
//import kerawaads.add.Setters_Getters;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

/**
 *
 * @author sakwe
 */
public class CreateNewXml {

    Setters_Getters getvalues = new Setters_Getters();
    //Readxml xmlmain = new Readxml();
    public List<File> imagesList = new ArrayList<>();
    public List<String> imagestext= new ArrayList<>();
    DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
    static DocumentBuilder dBuilder;

    public void SaveXmlDile(String filename, String adid,String subcat,String adwirte, String title, String desc, String price, String currency, String country, String city, String city_area,
            String address, String contact01, String contact02, String contact03, String sellers_name, String sellers_email, String show_email, String surface,
            String unity_price, String mile_age, String job_salary, String strmail, String autoVerify, String no_email, String attachment,
            String youtube_url, String base64)
            throws TransformerFactoryConfigurationError, SAXException, ParserConfigurationException {

        try {

            dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.newDocument();
            //add elements to Document
            Element rootElement = doc.createElementNS("http://www.kerawa.com/addcreator", "crawled_ads");
            //append root element to document
            doc.appendChild(rootElement);

            //append first child element to root element
            String val = "";
            String val2 = "";
            if ("true".equals(strmail)) {
                val = "True";
            } else {
                val = "False";
            }
            if ("true".equals(show_email)) {
                val2 = "True";
            } else {
                val2 = "False";
            }
            rootElement.appendChild(getEmployee(doc, adid, subcat,adwirte, title, desc, price, currency, country, city, city_area, address, contact01, contact02,
                    contact03, sellers_name, sellers_email, val2, surface, unity_price, mile_age, job_salary, val, autoVerify,
                    no_email, attachment,
                    youtube_url, base64));

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            //for pretty print
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            DOMSource source = new DOMSource(doc);

            //write to console or file
            //StreamResult console = new StreamResult(System.out);
            StreamResult file = new StreamResult(new File(filename));

            //write data
            //transformer.transform(source, console);
            transformer.transform(source, file);
            System.out.println("DONE");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private Node getEmployee(Document doc, String adid,String subcat, String adwriter, String title, String desc, String price, String currency, String country, String city, String city_area,
            String address, String contact01, String contact02, String contact03, String sellers_name, String sellers_email, String show_email, String surface,
            String unity_price, String mile_age, String job_salary, String contact_by_email, String autoVerify, String no_email, String attachment,
            String youtube_url, String base64) throws ParserConfigurationException, SAXException, IOException {

        Element employee = doc.createElement("ad");

        /*set id attribute
         * employee.setAttribute("id", id);
         *create name element
         */
        // create adid element
        
        employee.appendChild(getEmployeeElements(doc, employee, "adid", adid));

        employee.appendChild(getEmployeeElements(doc, employee, "subCategoryCode_c",subcat ));
        
        employee.appendChild(getEmployeeElements(doc, employee, "addWriter",adwriter ));
        
        //create  salary element
        employee.appendChild(getEmployeeElements(doc, employee, "title", title));

        //create email element
        employee.appendChild(getEmployeeElements(doc, employee, "desc", desc));

        //create city_code element
        employee.appendChild(getEmployeeElements(doc, employee, "price", price));

        //create autoVerify element
        employee.appendChild(getEmployeeElements(doc, employee, "currency", currency));

//        //create autoVerify element
//        employee.appendChild(getEmployeeElements(doc, employee, "country", country));

        //create autoVerify element
        employee.appendChild(getEmployeeElements(doc, employee, "cityCode_c", city));

//        //create autoVerify element
//        employee.appendChild(getEmployeeElements(doc, employee, "city_area", city_area));

        //create autoVerify element
        employee.appendChild(getEmployeeElements(doc, employee, "contact_address", address));

        //create autoVerify element
        employee.appendChild(getEmployeeElements(doc, employee, "contact_telephone", contact01));

        //create autoVerify element
        employee.appendChild(getEmployeeElements(doc, employee, "contact_telephone2", contact02));

        //create autoVerify element
        employee.appendChild(getEmployeeElements(doc, employee, "contact_telephone3", contact03));

        //create autoVerify element
        employee.appendChild(getEmployeeElements(doc, employee, "contact_name", sellers_name));

        //create autoVerify element
        employee.appendChild(getEmployeeElements(doc, employee, "email", sellers_email));

//        //create autoVerify element
//        employee.appendChild(getEmployeeElements(doc, employee, "show_email", show_email));

        //create autoVerify element
      //  employee.appendChild(getEmployeeElements(doc, employee, "surface", surface));

        //create autoVerify element
     //   employee.appendChild(getEmployeeElements(doc, employee, "unitry_price", unity_price));

        //create autoVerify element
        //employee.appendChild(getEmployeeElements(doc, employee, "mile_age", mile_age));

        //create autoVerify element
       // employee.appendChild(getEmployeeElements(doc, employee, "job_salary", job_salary));

        //create autoVerify element
       // employee.appendChild(getEmployeeElements(doc, employee, "contact_by_mail", contact_by_email));

        //create autoVerify element
        employee.appendChild(getEmployeeElements(doc, employee, "autoVerify", autoVerify));

        //create no_email element
        employee.appendChild(getEmployeeElements(doc, employee, "no_email", no_email));

        //create contact_name element
        //employee.appendChild(getEmployeeElements(doc, employee, "attachment", attachment));

        //create autoVerify element
        employee.appendChild(getEmployeeElements(doc, employee, "youtube_url", youtube_url));

      //call list method and get data stored it bytedata and tagname
        //
        if(getvalues.getBase64text() == "N/A"){
           employee.appendChild(getEmployeeElements(doc, employee, "base64image","N/A"  ));
        }else{
        int i = 0;
        FileInputStream fis;
        String stringBase64;
            System.out.println("imagelist lenght "+imagesList.size());
        for (File imagesList1 : imagesList) {

                fis = new FileInputStream(imagesList1);
                byte imageData[] = new byte[(int) imagesList1.length()];
                fis.read(imageData);
                stringBase64 = Base64.getEncoder().encodeToString(imageData);
//                Element imageTag = doc.createElement("base64image");
//                imageTag.appendChild(doc.createTextNode(stringBase64));
//                employee.appendChild(imageTag);
                
                 employee.appendChild(getEmployeeElements(doc, employee, "base64image",stringBase64  ));
            
            i++;
        }
        imagesList.clear();
        }
        return employee;
    }

    public List getListImage(File link) {
        List<File> fileList = new ArrayList<>();
        imagesList.add(link);
        return fileList;
    }
 
    public List getListtagnames(String txt) {
        List<String> baseList = new ArrayList<>();
        imagestext.add(txt);
        return baseList;
    }
 
    
    //utility method to create text node
    private static Node getEmployeeElements(Document doc, Element element, String name, String value) {
        Element node = doc.createElement(name);
        node.appendChild(doc.createTextNode(value));
        return node;
    }

}

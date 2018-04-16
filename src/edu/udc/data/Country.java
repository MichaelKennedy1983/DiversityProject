package edu.udc.data;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class Country {
    private String name;
    private String flagURL;
    private double ethnicFract;
    private double linguisticFract;
    private double religiousFract;
    private String capital;
    private double popMil;
    private String mapURL;
    private URL wikiURL;
    
    public Country() {
        this.name = null;
        this.flagURL = null;
        this.ethnicFract = 0;
        this.linguisticFract = 0;
        this.religiousFract = 0;
        this.capital = null;
        this.popMil = 0;
        this.mapURL = null;
        this.wikiURL = null;
    }
    
    public Country(String name, String flagURL, double ethnicFract,
                   double linguisticFract, double religiousFract,
                   String capital, double popMil, String mapURL,
                   URL wikiURL) {
        this.name = name;
        this.flagURL = flagURL;
        this.ethnicFract = ethnicFract;
        this.linguisticFract = linguisticFract;
        this.religiousFract = religiousFract;
        this.capital = capital;
        this.popMil = popMil;
        this.mapURL = mapURL;
        this.wikiURL = wikiURL;
    }
    
    public static ArrayList<Country> getCountryList() {
        ArrayList<Country> countries = new ArrayList<>();
        
        try {
            Country afghanistan = new Country("Afghanistan", "edu/udc/data/img/flags/Afghanistan.png",
                    0.769300, 0.769300, 0.271700,
                    "Kabul", 34.656, "edu/udc/data/img/maps/Afghanistan_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Afghanistan"));
            countries.add(afghanistan);
            
            Country albania = new Country("Albania", "edu/udc/data/img/flags/Albania.png",
                    0.220400, 0.039900, 0.471900,
                    "Tirana", 2.877, "edu/udc/data/img/maps/Albania_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Albania"));
            countries.add(albania);
            
            Country algeria = new Country("Algeria", "edu/udc/data/img/flags/Algeria.png",
                    0.339400, 0.442700, 0.009100,
                    "Algiers", 40.400, "edu/udc/data/img/maps/Algeria_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Algeria"));
            countries.add(algeria);
            
            Country americanSamoa = new Country("American Samoa", "edu/udc/data/img/flags/American_Samoa.png",
                    0.000000, 0.173300, 0.639500,
                    "Pago Pago", 0.000054, "edu/udc/data/img/maps/American_Samoa_Map.png",
                    new URL("https://en.wikipedia.org/wiki/American_Samoa"));
            countries.add(americanSamoa);
            
            Country andorra = new Country("Andorra", "edu/udc/data/img/flags/Andorra.png",
                    0.713900, 0.684800, 0.232600,
                    "Andorra la Vella", 0.000077, "edu/udc/data/img/maps/Andorra_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Andorra"));
            countries.add(andorra);
            
            Country angola = new Country("Angola", "edu/udc/data/img/flags/Angola.png",
                    0.786700, 0.787000, 0.627600,
                    "Luanda", 25.789, "edu/udc/data/img/maps/Angola_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Angola"));
            countries.add(angola);
            
            Country antAndB = new Country("Antigua and Barbuda", "edu/udc/data/img/flags/Antigua_and_Barbuda.png",
                    0.164300, 0.106300, 0.684000,
                    "St. John's", 0.101, "edu/udc/data/img/maps/Antigua_and_Barbuda_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Antigua_and_Barbuda"));
            countries.add(antAndB);
            
            Country argentina = new Country("Argentina", "edu/udc/data/img/flags/Argentina.png",
                    0.255000, 0.061800, 0.223600,
                    "Buenos Aires", 43.847, "edu/udc/data/img/maps/Argentina_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Argentina"));
            countries.add(argentina);
            
            Country armenia = new Country("Armenia", "edu/udc/data/img/flags/Armenia.png",
                    0.127200, 0.129100, 0.457600,
                    "Yerevan", 2.925, "edu/udc/data/img/maps/Armenia_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Armenia"));
            countries.add(armenia);
            
            Country aruba = new Country("Aruba", "edu/udc/data/img/flags/Aruba.png",
                    0.000000, 0.388900, 0.410700,
                    "Oranjestad", 0.105, "edu/udc/data/img/maps/Aruba_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Aruba"));
            countries.add(aruba);
            
            Country australia = new Country("Australia", "edu/udc/data/img/flags/Australia.png",
                    0.092900, 0.334900, 0.821100,
                    " Canberra", 24.899, "edu/udc/data/img/maps/Australia_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Australia"));
            countries.add(australia);
            
            Country austria = new Country("Austria", "edu/udc/data/img/flags/Austria.png",
                    0.106800, 0.152200, 0.414600,
                    "Vienna", 8.823, "edu/udc/data/img/maps/Austria_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Austria"));
            countries.add(austria);
            
            Country azerbaijan = new Country("Azerbaijan", "edu/udc/data/img/flags/Azerbaijan.png",
                    0.204700, 0.205400, 0.489900,
                    "Baku", 9.867, "edu/udc/data/img/maps/Azerbaijan_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Azerbaijan"));
            countries.add(azerbaijan);
            
            Country bahamas = new Country("Bahamas", "edu/udc/data/img/flags/Bahamas.png",
                    0.422800, 0.185500, 0.681500,
                    "Nassau", 0.391, "edu/udc/data/img/maps/Bahamas_Map.png",
                    new URL("https://en.wikipedia.org/wiki/The_Bahamas"));
            countries.add(bahamas);
            
            Country bahrain = new Country("Bahrain", "edu/udc/data/img/flags/Bahrain.png",
                    0.502100, 0.434400, 0.552800,
                    "Manama", 1.425, "edu/udc/data/img/maps/Bahrain_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Bahrain"));
            countries.add(bahrain);
            
            Country bangladesh = new Country("Bangladesh", "edu/udc/data/img/flags/Bangladesh.png",
                    0.045400, 0.092500, 0.209000,
                    "Dhaka", 162.952, "edu/udc/data/img/maps/Bangladesh_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Bangladesh"));
            countries.add(bangladesh);
            
            Country barbados = new Country("Barbados", "edu/udc/data/img/flags/Barbados.png",
                    0.142300, 0.092600, 0.693400,
                    "Bridgetown", 0.278, "edu/udc/data/img/maps/Barbados_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Barbados"));
            countries.add(barbados);
            
            Country belarus = new Country("Belarus", "edu/udc/data/img/flags/Belarus.png",
                    0.322200, 0.466600, 0.611600,
                    "Minsk", 9.505, "edu/udc/data/img/maps/Belarus_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Belarus"));
            countries.add(belarus);
            
            Country belgium = new Country("Belgium", "edu/udc/data/img/flags/Belgium_(civil).png",
                    0.555400, 0.540900, 0.212700,
                    "Brussels", 11.358, "edu/udc/data/img/maps/Belgium_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Belgium"));
            countries.add(belgium);
            
            Country belize = new Country("Belize", "edu/udc/data/img/flags/Belize.png",
                    0.701500, 0.630300, 0.581300,
                    "Belmopan", 0.388, "edu/udc/data/img/maps/Belize_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Belize"));
            countries.add(belize);
            
            Country benin = new Country("Benin", "edu/udc/data/img/flags/Benin.png",
                    0.787200, 0.790500, 0.554400,
                    "Porto-Novo", 10.872, "edu/udc/data/img/maps/Benin_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Benin"));
            countries.add(benin);
            
            Country bermuda = new Country("Bermuda", "edu/udc/data/img/flags/Bermuda.png",
                    0.000000, 0.000000, 0.711200,
                    "Hamilton", 0.063, "edu/udc/data/img/maps/Bermuda_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Bermuda"));
            countries.add(bermuda);
            
            Country bhutan = new Country("Bhutan", "edu/udc/data/img/flags/Bhutan.png",
                    0.605000, 0.605600, 0.378700,
                    "Thimphu", 0.798, "edu/udc/data/img/maps/Bhutan_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Bhutan"));
            countries.add(bhutan);
            
            Country bolivia = new Country("Bolivia", "edu/udc/data/img/flags/Bolivia.png",
                    0.739600, 0.224000, 0.208500,
                    "Sucre", 11.218, "edu/udc/data/img/maps/Bolivia_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Bolivia"));
            countries.add(bolivia);
            
            Country bosnia = new Country("Bosnia and Herzegovina", "edu/udc/data/img/flags/Bosnia_and_Herzegovina.png",
                    0.630000, 0.675100, 0.685100,
                    "Sarajevo", 3.531, "edu/udc/data/img/maps/Bosnia_and_Herzegovina_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Bosnia_and_Herzegovina"));
            countries.add(bosnia);
            
            Country botswana = new Country("Botswana", "edu/udc/data/img/flags/Botswana.png",
                    0.410200, 0.411000, 0.598600,
                    "Gaborone", 2.250, "edu/udc/data/img/maps/Botswana_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Botswana"));
            countries.add(botswana);
            
            Country brazil = new Country("Brazil", "edu/udc/data/img/flags/Brazil.png",
                    0.540800, 0.046800, 0.605400,
                    "Brasília", 208.733, "edu/udc/data/img/maps/Brazil_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Brazil"));
            countries.add(brazil);
            
            Country brunei = new Country("Brunei", "edu/udc/data/img/flags/Brunei.png",
                    0.541600, 0.343800, 0.440400,
                    "Bandar Seri Begawan", 0.417, "edu/udc/data/img/maps/Brunei_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Brunei"));
            countries.add(brunei);
            
            Country bulgaria = new Country("Bulgaria", "edu/udc/data/img/flags/Bulgaria.png",
                    0.402100, 0.303100, 0.596500,
                    "Sofia", 7.102, "edu/udc/data/img/maps/Bulgaria_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Bulgaria"));
            countries.add(bulgaria);
            
            Country burkinaFaso = new Country("Burkina Faso", "edu/udc/data/img/flags/Burkina_Faso.png",
                    0.737700, 0.722800, 0.579800,
                    "Ouagadougou", 20.108, "edu/udc/data/img/maps/Burkina_Faso_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Burkina_Faso"));
            countries.add(burkinaFaso);
            
            Country burundi = new Country("Burundi", "edu/udc/data/img/flags/Burundi.png",
                    0.295100, 0.297700, 0.515800,
                    "Bujumbura", 10.524, "edu/udc/data/img/maps/Burundi_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Burundi"));
            countries.add(burundi);
            
            Country cambodia = new Country("Cambodia", "edu/udc/data/img/flags/Cambodia.png",
                    0.210500, 0.210400, 0.096500,
                    "Phnom Penh", 15.762, "edu/udc/data/img/maps/Cambodia_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Cambodia"));
            countries.add(cambodia);
            
            Country cameroon = new Country("Cameroon", "edu/udc/data/img/flags/Cameroon.png",
                    0.863500, 0.889800, 0.733800,
                    "Yaoundé", 23.439, "edu/udc/data/img/maps/Cameroon_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Cameroon"));
            countries.add(cameroon);
            
            Country  canada = new Country("Canada", "edu/udc/data/img/flags/Canada.png",
                    0.712400, 0.577200, 0.695800,
                    "Ottawa", 35.152, "edu/udc/data/img/maps/Canada_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Canada"));
            countries.add(canada);
            
            Country capeVerde = new Country("Cape Verde", "edu/udc/data/img/flags/Cape_Verde.png",
                    0.417400, 0.000000, 0.076600,
                    "Praia", 0.540, "edu/udc/data/img/maps/Cape_Verde_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Cape_Verde"));
            countries.add(capeVerde);
            
            Country centralAfricanRep = new Country("Central African Republic", "edu/udc/data/img/flags/Central_African_Republic.png",
                    0.829500, 0.833400, 0.791600,
                    "Bangui", 4.595, "edu/udc/data/img/maps/Central_African_Republic_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Central_African_Republic"));
            countries.add(centralAfricanRep);
            
            Country chad = new Country("Chad", "edu/udc/data/img/flags/Chad.png",
                    0.862000, 0.863500, 0.641100,
                    "N'Djamena", 13.670, "edu/udc/data/img/maps/Chad_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Chad"));
            countries.add(chad);
            
            Country chile = new Country("Chile", "edu/udc/data/img/flags/Chile.png",
                    0.186100, 0.187100, 0.384100,
                    "Santiago", 17.574, "edu/udc/data/img/maps/Chile_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Chile"));
            countries.add(chile);
            
            Country china = new Country("China", "edu/udc/data/img/flags/China.png",
                    0.153800, 0.132700, 0.664300,
                    "Beijing", 1403.500, "edu/udc/data/img/maps/China_Map.png",
                    new URL("https://en.wikipedia.org/wiki/China"));
            countries.add(china);
            
            Country columbia = new Country("Columbia", "edu/udc/data/img/flags/Colombia.png",
                    0.601400, 0.019300, 0.147800,
                    "Bogotá", 49.588, "edu/udc/data/img/maps/Colombia_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Colombia"));
            countries.add(columbia);
            
            Country comoros = new Country("Comoros", "edu/udc/data/img/flags/Comoros.png",
                    0.000000, 0.010300, 0.013700,
                    "Moroni", 0.796, "edu/udc/data/img/maps/Comoros_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Comoros"));
            countries.add(comoros);
            
            Country drCongo = new Country("Democratic Republic of Congo", "edu/udc/data/img/flags/Democratic_Republic_of_the_Congo.png",
                    0.874700, 0.870500, 0.702100,
                    "Kinshasa", 78.736, "edu/udc/data/img/maps/Democratic_Republic_of_the_Congo_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Democratic_Republic_of_the_Congo"));
            countries.add(drCongo);
            
            Country congo = new Country("Congo", "edu/udc/data/img/flags/Congo.png",
                    0.874700, 0.687100, 0.664200,
                    "Brazzaville", 5.126, "edu/udc/data/img/maps/Congo_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Republic_of_the_Congo"));
            countries.add(congo);
            
            Country costaRica = new Country("Costa Rica", "edu/udc/data/img/flags/Costa_Rica.png",
                    0.236800, 0.048900, 0.241000,
                    "San José", 4.857, "edu/udc/data/img/maps/Costa_Rica_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Costa_Rica"));
            countries.add(costaRica);
            
            Country ivoryCoast = new Country("Ivory Coast", "edu/udc/data/img/flags/Ivory_Coast.png",
                    0.820400, 0.784200, 0.755100,
                    "Yamoussoukro", 23.740, "edu/udc/data/img/maps/Ivory_Coast_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Ivory_Coast"));
            countries.add(ivoryCoast);
            
            Country croatia = new Country("Croatia", "edu/udc/data/img/flags/Croatia.png",
                    0.369000, 0.076300, 0.444700,
                    "Zagreb", 4.154, "edu/udc/data/img/maps/Croatia_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Croatia"));
            countries.add(croatia);
            
            Country cuba = new Country("Cuba", "edu/udc/data/img/flags/Cuba.png",
                    0.590800, 0.000000, 0.505900,
                    "Havana", 11.239, "edu/udc/data/img/maps/Cuba_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Cuba"));
            countries.add(cuba);
            
            Country cyprus = new Country("Cyprus", "edu/udc/data/img/flags/Cyprus.png",
                    0.093900, 0.396200, 0.396200,
                    "Nicosia", 1.170, "edu/udc/data/img/maps/Cyprus_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Cyprus"));
            countries.add(cyprus);
            
            Country czechRep = new Country("Czech Republic", "edu/udc/data/img/flags/Czech_Republic.png",
                    0.322200, 0.323300, 0.659100,
                    "Prague", 10.611, "edu/udc/data/img/maps/Czech_Republic_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Czech_Republic"));
            countries.add(czechRep);
            
            Country denmark = new Country("Denmark", "edu/udc/data/img/flags/Denmark.png",
                    0.081900, 0.104900, 0.233300,
                    "Copenhagen", 5.749, "edu/udc/data/img/maps/Denmark_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Denmark"));
            countries.add(denmark);
            
            Country djibouti = new Country("Djibouti", "edu/udc/data/img/flags/Djibouti.png",
                    0.796200, 0.655800, 0.043500,
                    "Djibouti", 0.942, "edu/udc/data/img/maps/Djibouti_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Djibouti"));
            countries.add(djibouti);
            
            Country dominica = new Country("Dominica", "edu/udc/data/img/flags/Dominica.png",
                    0.200300, 0.000000, 0.462800,
                    "Roseau", 0.074, "edu/udc/data/img/maps/Dominica_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Dominica"));
            countries.add(dominica);
            
            Country dominicanRep = new Country("Dominican Republic", "edu/udc/data/img/flags/Dominican_Republic.png",
                    0.429400, 0.039500, 0.311800,
                    "Santo Domingo", 10.801, "edu/udc/data/img/maps/Dominican_Republic_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Dominican_Republic"));
            countries.add(dominicanRep);
            
            Country eastTimor = new Country("East Timor", "edu/udc/data/img/flags/East_Timor.png",
                    0.000000, 0.526100, 0.425400,
                    "Dili", 1.167, "edu/udc/data/img/maps/East_Timor_Map.png",
                    new URL("https://en.wikipedia.org/wiki/East_Timor"));
            countries.add(eastTimor);
            
            Country ecuador = new Country("Ecuador", "edu/udc/data/img/flags/Ecuador.png",
                    0.655000, 0.130800, 0.141700,
                    "Quito", 16.385, "edu/udc/data/img/maps/Ecuador_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Ecuador"));
            countries.add(ecuador);
            
            Country egypt = new Country("Egypt", "edu/udc/data/img/flags/Egypt.png",
                    0.183600, 0.023700, 0.197900,
                    "Cairo", 96.789, "edu/udc/data/img/maps/Egypt_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Egypt"));
            countries.add(egypt);
            
            Country elSalvador = new Country("El Salvador", "edu/udc/data/img/flags/El_Salvador.png",
                    0.197800, 0.000000, 0.355900,
                    "San Salvador", 6.345, "edu/udc/data/img/maps/ElSalvador_Map.png",
                    new URL("https://en.wikipedia.org/wiki/El_Salvador"));
            countries.add(elSalvador);
            
            Country equatorialGuinea = new Country("Equatorial Guinea", "edu/udc/data/img/flags/Equatorial_Guinea.png",
                    0.346700, 0.322000, 0.119500,
                    "Malabo", 1.221, "edu/udc/data/img/maps/Equatorial_Guinea_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Equatorial_Guinea"));
            countries.add(equatorialGuinea);
            
            Country eritrea = new Country("Eritrea", "edu/udc/data/img/flags/Eritrea.png",
                    0.652400, 0.653000, 0.425300,
                    "Asmara", 4.955, "edu/udc/data/img/maps/Eritrea_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Eritrea"));
            countries.add(eritrea);
            
            Country estonia = new Country("Estonia", "edu/udc/data/img/flags/Estonia.png",
                    0.506200, 0.494400, 0.498500,
                    "Tallinn", 1.319, "edu/udc/data/img/maps/Estonia_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Estonia"));
            countries.add(estonia);
            
            Country ethiopia = new Country("Ethiopia", "edu/udc/data/img/flags/Ethiopia.png",
                    0.723500, 0.807300, 0.624900,
                    "Addis Ababa", 102.403, "edu/udc/data/img/maps/Ethiopia_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Ethiopia"));
            countries.add(ethiopia);
            
            Country faroeIslands = new Country("Faroe Islands", "edu/udc/data/img/flags/Faroe_Islands.png",
                    0.000000, 0.000000, 0.314700,
                    "Tórshavn", 0.050, "edu/udc/data/img/maps/Faroe_Islands_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Faroe_Islands"));
            countries.add(faroeIslands);
            
            Country fiji = new Country("Fiji", "edu/udc/data/img/flags/Fiji.png",
                    0.547900, 0.547900, 0.568200,
                    "Suva", 0.899, "edu/udc/data/img/maps/Fiji_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Fiji"));
            countries.add(fiji);
            
            Country finland = new Country("Finland", "edu/udc/data/img/flags/Finland.png",
                    0.131500, 0.141200, 0.253100,
                    "Helsinki", 5.510, "edu/udc/data/img/maps/Finland_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Finland"));
            countries.add(finland);
            
            Country france = new Country("France", "edu/udc/data/img/flags/France.png",
                    0.103200, 0.122100, 0.402900,
                    "Paris", 67.201, "edu/udc/data/img/maps/France_Map.png",
                    new URL("https://en.wikipedia.org/wiki/France"));
            countries.add(france);
            
            Country frenchGuiana = new Country("French Guiana", "edu/udc/data/img/flags/French_Guiana.png",
                    0.000000, 0.115400, 0.495900,
                    "", 0.282, "edu/udc/data/img/maps/French_Guiana_Map.png",
                    new URL("https://en.wikipedia.org/wiki/French_Guiana"));
            countries.add(frenchGuiana);
            
            Country frenchPoly = new Country("French Polynesia", "edu/udc/data/img/flags/French_Polynesia.png",
                    0.000000, 0.607800, 0.581300,
                    "Papeete", 0.276, "edu/udc/data/img/maps/French_Polynesia_Map.png",
                    new URL("https://en.wikipedia.org/wiki/French_Polynesia"));
            countries.add(frenchPoly);
            
            Country gabon = new Country("Gabon", "edu/udc/data/img/flags/Gabon.png",
                    0.769000, 0.782100, 0.667400,
                    "Libreville", 1.980, "edu/udc/data/img/maps/Gabon_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Gabon"));
            countries.add(gabon);
            
            Country gambia = new Country("Gambia", "edu/udc/data/img/flags/Gambia.png",
                    0.786400, 0.807600, 0.097000,
                    "Banjul", 2.051, "edu/udc/data/img/maps/Gambia_Map.png",
                    new URL("https://en.wikipedia.org/wiki/The_Gambia"));
            countries.add(gambia);
            
            Country gaza = new Country("Gaza Strip", "edu/udc/data/img/flags/Gaza_Strip.png",
                    0.000000, 0.010400, 0.034200,
                    "Gaza City", 1.850, "edu/udc/data/img/maps/Gaza_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Gaza_Strip"));
            countries.add(gaza);
            
            Country georgia = new Country("Georgia", "edu/udc/data/img/flags/Georgia.png",
                    0.492300, 0.474900, 0.654300,
                    "Tbilisi", 3.718, "edu/udc/data/img/maps/Georgia_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Georgia_(country)"));
            countries.add(georgia);
            
            Country germany = new Country("Germany", "edu/udc/data/img/flags/Germany.png",
                    0.168200, 0.164200, 0.657100,
                    "Berlin", 82.800, "edu/udc/data/img/maps/Germany_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Germany"));
            countries.add(germany);
            
            Country ghana = new Country("Ghana", "edu/udc/data/img/flags/Ghana.png",
                    0.673300, 0.673100, 0.798700,
                    "Accra", 27.043, "edu/udc/data/img/maps/Ghana_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Ghana"));
            countries.add(ghana);

            Country greece = new Country("Greece", "edu/udc/data/img/flags/Greece.png",
                    0.157600, 0.030000, 0.153000,
                    "Athens", 10.768, "edu/udc/data/img/maps/Greece_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Greece"));
            countries.add(greece);

            Country greenland = new Country(" Greenland", "edu/udc/data/img/flags/Greenland.png",
                    0.000000, 0.218800, 0.459200,
                    "Nuuk", 0.056, "edu/udc/data/img/maps/Greenland_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Greenland"));
            countries.add(greenland);

            Country grenada = new Country("Grenada", "edu/udc/data/img/flags/Grenada.png",
                    0.266100, 0.000000, 0.589800,
                    "St. George's", 0.107, "edu/udc/data/img/maps/Grenada_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Grenada"));
            countries.add(grenada);

            Country guadeloupe = new Country("Guadeloupe", "edu/udc/data/img/flags/Guadeloupe.png",
                    0.000000, 0.093300, 0.306900,
                    "", 0.406, "edu/udc/data/img/maps/Guadeloupe_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Guadeloupe"));
            countries.add(guadeloupe);

            Country guam = new Country("Guam", "edu/udc/data/img/flags/Guam.png",
                    0.000000, 0.732000, 0.408200,
                    "Hagåtña", 0.163, "edu/udc/data/img/maps/Guam_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Guam"));
            countries.add(guam);

            Country guatemala = new Country("Guatemala", "edu/udc/data/img/flags/Guatemala.png",
                    0.512200, 0.458600, 0.375300,
                    "Guatemala City", 17.263, "edu/udc/data/img/maps/Guatemala_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Guatemala"));
            countries.add(guatemala);

            Country guinea = new Country("Guinea", "edu/udc/data/img/flags/Guinea.png",
                    0.738900, 0.772500, 0.264900,
                    "Conakry", 12.396, "edu/udc/data/img/maps/Guinea_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Guinea"));
            countries.add(guinea);

            Country guineaBissau = new Country("Guinea-Bissau", "edu/udc/data/img/flags/Guinea-Bissau.png",
                    0.808200, 0.814100, 0.612800,
                    "Bissau", 1.816, "edu/udc/data/img/maps/Guinea_Bissau_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Guinea-Bissau"));
            countries.add(guineaBissau);

            Country guyana = new Country("Guyana", "edu/udc/data/img/flags/Guyana.png",
                    0.619500, 0.068800, 0.787600,
                    "Georgetown", 0.773, "edu/udc/data/img/maps/Guyana_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Guyana"));
            countries.add(guyana);

            Country haiti = new Country("Haiti", "edu/udc/data/img/flags/Haiti.png",
                    0.095000, 0.000000, 0.470400,
                    "Port-au-Prince", 10.847, "edu/udc/data/img/maps/Haiti_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Haiti"));
            countries.add(haiti);

            Country honduras = new Country("Honduras", "edu/udc/data/img/flags/Honduras.png",
                    0.186700, 0.055300, 0.235700,
                    "Tegucigalpa", 9.113, "edu/udc/data/img/maps/Honduras_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Honduras"));
            countries.add(honduras);

            Country hongKong = new Country("Hong Kong", "edu/udc/data/img/flags/Hong_Kong.png",
                    0.062000, 0.212800, 0.419100,
                    "", 7.410, "edu/udc/data/img/maps/Hong_Kong_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Hong_Kong"));
            countries.add(hongKong);

            Country hungary = new Country("Hungary", "edu/udc/data/img/flags/Hungary.png",
                    0.152200, 0.029700, 0.524400,
                    "Budapest", 9.798, "edu/udc/data/img/maps/Hungary_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Hungary"));
            countries.add(hungary);

            Country iceland = new Country("Iceland", "edu/udc/data/img/flags/Iceland.png",
                    0.079800, 0.082000, 0.191300,
                    "Reykjavík", 0.349, "edu/udc/data/img/maps/Iceland_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Iceland"));
            countries.add(iceland);

            Country india = new Country("India", "edu/udc/data/img/flags/India.png",
                    0.418200, 0.806900, 0.326000,
                    "New Delhi", 1324.171, "edu/udc/data/img/maps/India_Map.png",
                    new URL("https://en.wikipedia.org/wiki/India"));
            countries.add(india);

            Country indonesia = new Country("Indonesia", "edu/udc/data/img/flags/Indonesia.png",
                    0.735100, 0.768000, 0.234000,
                    "Jakarta", 261.115, "edu/udc/data/img/maps/Indonesia_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Indonesia"));
            countries.add(indonesia);

            Country iran = new Country("Iran", "edu/udc/data/img/flags/Iran.png",
                    0.668400, 0.746200, 0.115200,
                    "Tehran", 81.000, "edu/udc/data/img/maps/Iran_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Iran"));
            countries.add(iran);

            Country iraq = new Country("Iraq", "edu/udc/data/img/flags/Iraq.png",
                    0.368900, 0.369400, 0.484400,
                    "Baghdad", 37.203, "edu/udc/data/img/maps/Iraq_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Iraq"));
            countries.add(iraq);

            Country ireland = new Country("Ireland", "edu/udc/data/img/flags/Ireland.png",
                    0.120600, 0.031200, 0.155000,
                    "Dublin", 4.762, "edu/udc/data/img/maps/Ireland_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Republic_of_Ireland"));
            countries.add(ireland);

            Country isleMan = new Country("Isle of Man", "edu/udc/data/img/flags/Isle_of_Man.png",
                    0.000000, 0.000000, 0.472900,
                    "Douglas", 0.083, "edu/udc/data/img/maps/Isle_of_Man_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Isle_of_Man"));
            countries.add(isleMan);

            Country israel = new Country("Israel", "edu/udc/data/img/flags/Israel.png",
                    0.343600, 0.552500, 0.346900,
                    "Jerusalem", 8.843, "edu/udc/data/img/maps/Israel_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Israel"));
            countries.add(israel);

            Country italy = new Country("Italy", "edu/udc/data/img/flags/Italy.png",
                    0.114500, 0.114700, 0.302700,
                    "Rome", 60.589, "edu/udc/data/img/maps/Italy_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Italy"));
            countries.add(italy);

            Country jamaica = new Country("Jamaica", "edu/udc/data/img/flags/Jamaica.png",
                    0.412900, 0.109800, 0.616000,
                    "Kingston", 2.881, "edu/udc/data/img/maps/Jamaica_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Jamaica"));
            countries.add(jamaica);

            Country japan = new Country("Japan", "edu/udc/data/img/flags/Japan.png",
                    0.011900, 0.017800, 0.540600,
                    "Tokyo", 126.672, "edu/udc/data/img/maps/Japan_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Japan"));
            countries.add(japan);

            Country jersey = new Country("Jersey", "edu/udc/data/img/flags/Jersey.png",
                    0.000000, 0.000000, 0.547900,
                    "Saint Helier", 0.100, "edu/udc/data/img/maps/Jersey_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Jersey"));
            countries.add(jersey);

            Country jordan = new Country("Jordan", "edu/udc/data/img/flags/Jordan.png",
                    0.592600, 0.039600, 0.065900,
                    "Amman", 10.012, "edu/udc/data/img/maps/Jordan_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Jordan"));
            countries.add(jordan);

            Country kazakhstan = new Country("Kazakhstan", "edu/udc/data/img/flags/Kazakhstan.png",
                    0.617100, 0.662100, 0.589800,
                    "Astana", 17.988, "edu/udc/data/img/maps/Kazakhstan_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Kazakhstan"));
            countries.add(kazakhstan);

            Country kenya = new Country("Kenya", "edu/udc/data/img/flags/Kenya.png",
                    0.858800, 0.886000, 0.776500,
                    "Nairobi", 49.125, "edu/udc/data/img/maps/Kenya_Map.png",
                    new URL("https://en.wikipedia.org/wiki/Kenya"));
            countries.add(kenya);
        } catch (MalformedURLException e) {
            System.err.println(e);
        }
    
    
        return countries;
    }
    
    // Accessors
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getFlagURL() { return flagURL; }
    public void setFlagURL(String flagURL) { this.flagURL = flagURL; }
    public double getEthnicFract() { return ethnicFract; }
    public void setEthnicFract(double ethnicFract) { this.ethnicFract = ethnicFract; }
    public double getLinguisticFract() { return linguisticFract; }
    public void setLinguisticFract(double linguisticFract) { this.linguisticFract = linguisticFract; }
    public double getReligiousFract() { return religiousFract; }
    public void setReligiousFract(double religiousFract) { this.religiousFract = religiousFract; }
    public String getCapital() { return capital; }
    public void setCapital(String capital) { this.capital = capital; }
    public double getPopMil() { return popMil; }
    public void setPopMil(double popMil) { this.popMil = popMil; }
    public String getMapURL() { return mapURL; }
    public void setMapURL(String mapURL) { this.mapURL = mapURL; }
    public URL getWikiURL() { return wikiURL; }
    public void setWikiURL(URL wikiURL) { this.wikiURL = wikiURL; }
}

package com.sas.delhibusnavigator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class TourismDetails extends Activity {

    ImageView img;
    TextView tv;
    TextView desc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tourism_details);

        Intent intent = getIntent();
        int i = intent.getIntExtra("pos", 0);
        int imgcode = intent.getIntExtra("img", 0);
        String s = intent.getStringExtra("name");

        img = (ImageView)findViewById(R.id.img);
        tv = (TextView)findViewById(R.id.detail_name);
        desc = (TextView)findViewById(R.id.desc);

        img.setImageResource(imgcode);
        tv.setText(s);

        String details="";
        switch(i)
        { case 0 : details="\n\nThe Akshardham constructed of " +
                "recent times and was inaugurated temple Bochasanvasi Swaminarayan Sanstha " +
                "on the banks of the River Yamuna.\n" +
                "The temple stretches over an area of 100 acres and was completed in two years.\n" +
                "This temple has awesome musical fountain which started in the evening.\n" +
                "Open timings 9 am to 8 pm (Monday closed).";
            break;
            case 1 : details="\n\nAnsal Plaza offers the customers a " +
                    "world class shopping experience located near South Extensio in South Delhi.\n" +
                    "This huge plaza is built on 35 acres of land.\nAn auditorium with a stage is " +
                    "located at the centre while the 45-feet high splendid Ansal Plaza is built " +
                    "around it.\nThe Plaza has a French glass curtain wall that to keep away" +
                    " ultraviolet and other harmful radiation.";
                break;
            case 2 : details="\n\nAppu Ghar was an amusement park located " +
                    "in the Pragati Maidan in Delhi.\nThis was the first amusement park of India, " +
                    "and was inaugurated by Late Shri Rajiv Gandhi, who was the Prime Minister" +
                    " of India.\nAppu Ghar closed on 17th Feb 2008.\nAppu Ghar was opened on " +
                    "November 19, 1984 and was named from the name 'Appu' which was the mascot " +
                    "of the 1982 Asian Games.\nIt stretched over 15.5 acres of land.";
                break;
            case 3 : details="\n\nA respected name in the art world " +
                    "was founded in 1977 by Roshen Alkazi.\nThe gallery holds regular " +
                    "exhibitions throughout the year of some of the best known artists in " +
                    "India.\nAddress: 205, Triveni Kala Sangam, Tansen Marg, New Delhi.\nPhone.:23718833." +
                    "\nTiming: 11.00 am to 7.00 pm .";
                break;
            case 4 : details="\n\nChandni Chowk is one of the " +
                    "oldest market places that, it has still retained its charm.\nChandni Chowk is " +
                    "located opposite the Red Fort.\nAt one end of the Chandni Chowk, one which" +
                    " Mosque, been built by the wives of Shah Jahan.\nAt the other end of Chandni " +
                    "Chowk, is the old police station or the Kotwali.\nIt is famous for " +
                    "shopping all types of goods";
                break;
            case 5 : details="\n\nDilli Haat stands for the " +
                    "variety Indian foods and customs in a single roomy enclosed space of " +
                    "six acres.\nA permanent and improvised adaptation of a traditional village" +
                    " haat, it is actually a mixture of a food plaza and craft marketplace, " +
                    "located in the locality of South Delhi. ";
                break;
            case 6 : details="\n\nIt is a Place " +
                    "worth visiting place if you are interested in the live processes of art. " +
                    "\nThis studio is a part of and is run by The Lalit Kala Academy. " +
                    "\nWell known artists from India and abroad often hold workshops and " +
                    "illustrated lectures here.\nAddress: Kala Kutir, East of Kailash, New Delhi. " +
                    "\nPhone.:- 26432225 \nTiming: 10.00 am to 6.00 pm .";
                break;
            case 7 : details="\n\nThe Greater Kailash area " +
                    "of South Delhi has it all; lavish cozy homes, elegant dresses, " +
                    "brisk crowd and bountiful markets. " +
                    "\nOne of the most colorful and posh markets of Delhi, this place is a " +
                    "real paradise. \nMagnificent show rooms and retail outlets selling designer " +
                    "wears, restaurants & easy accessibility give the " +
                    "Greater Kailash market the edge.";
                break;
            case 8 : details="\n\nGurudwara Bangla" +
                    " Sahib is located next to Gol Dak Khana near the Connaught Place. \nThis " +
                    "place of Sikh worship is open to people of all faiths, castes or creeds. " +
                    "\nThe premises house a sacred pond in which devotees bathe. \nThey believe " +
                    "that this would wash off their misdeeds and thus allow them to attain " +
                    "peace of mind.";
                break;
            case 9 : details="\n\nIt is located near the crossing " +
                    "of Mathura road and Lodhi road, this magnificent garden tomb is the first " +
                    "substantial example of Mughal architecture in India." +
                    "\nIt was built in 1565 A.D. nine years after the death of Humayun, by his " +
                    "senior widow Bega Begam. \nInside the walled enclosure the most notable " +
                    "features are the garden squares (chaharbagh) with pathways water channels.";
                break;
            case 10 : details="\n\nAt the centre of New Delhi stands " +
                    "the 42 m Triomphe like archway in the middle of a crossroad.\nIt " +
                    "commemorates the 70,000 peoples fighting for the British Army during " +
                    "the World War I. " +
                    "\nThe memorial bears the names of more than 13,516 British and Indian soldiers " +
                    "killed in the Northwestern war of 1919. \nThe monument was dedicated to the " +
                    "nation and known by Amar Jawan Jyoti";
                break;
            case 11 : details="\n\nIndira Gandhi Memorial " +
                    "Museum was the residence of the former Prime Minister of India. \nIt was later " +
                    "converted into a museum. " +
                    "\nOne can see the collection of rare photographs of the Nationalist movement, " +
                    "the personal moments of the Nehru-Gandhi family and her childhood. " +
                    "\nAddress : No. 1, Safderjang Road, New Delhi- 110 011. \nTiming: 9.30am To " +
                    "5:00 pm \nClosed: Monday.";
                break;
            case 12 : details="\n\nThe ISKCON Temple is located at " +
                    "Hare Krishna Hill, Sant Nagar, East of Kailash,New Delhi,DL-110065. " +
                    "\nPhone.:- 011-26235133\nIt was completed in 1998 as a complex of temples. " +
                    "\nThis temple has been built on a hilly terrain and is dedicated to the " +
                    "Lord Krishna. \nA great sense of calm, stillness envelope you once you enter " +
                    "the premises. \nMany spiritual activities are carried out in the temple " +
                    "premises throughout the year.";
                break;
            case 13 : details="\n\nJama Masjid,is located in " +
                    "Chandni Chowk, New Delhi \nPhone.:-011-23365358 \nIt was commissioned " +
                    "to be constructed by the Mughal Emperor Shah Jahan. " +
                    "\nIt holds the distinction of being one of the biggest and the most well " +
                    "known mosque of Old Delhi. \nDue to its setting at a very prominent center " +
                    "in Old Delhi, a lot of visitors visit it right through the year. ";
                break;
            case 14 : details="\n\nJantar Mantar is located at " +
                    "Sansad Marg, Janpath, Connaught Place,New Delhi,DL-110001 " +
                    "\nPhone:- 011-23365358 \nOpen: All days ,Timings: 6:00 am – 7:00 pm \nEntry" +
                    " Fee: Rs.5(Indians),Rs.100(foreigners)." +
                    "\nJantar Mantar(jantra- instruments, mantra- formulae) was constructed in 1724.";
                break;
            case 15 : details="\n\nThe Lodhi Gardens is a " +
                    "recreational area in Delhi,located at Amrita Shergill Ln, Lodhi Gardens, " +
                    "Lodi Estate, New Delhi,DL-110003 Timimg: 6.00 AM - 7.00 PM and situated " +
                    "between Khan Market and Safdarjung's Lodhi Road. " +
                    "\nIn the middle of Lodhi and Sayyid aristocratic beautiful gardens is the " +
                    "Bara Gumbad or the 'Big Dome' and Sheesh'mirror dome'";
                break;
            case 16 : details="\n\nLotus Temple is situated at " +
                    "Lotus Temple Rd, Shambhu Dayal Bagh, Bahapur, New Delhi, Delhi 110019 " +
                    "\nPnone.:- 011-23389326 \nTiming: 9:30 am – 5:30 pm.\nIt is incredible architectures" +
                    " of the faith.\nThe temple has been constructed to resemble a lotus flower. " +
                    "\nThe huge lotus flower has been made out of marble, dolomite, cement," +
                    " and sand.\nThe place is known for its spotlessly clean environment.";
                break;
            case 17 : details="\n\nIt is located near " +
                    "the Old Fort,Mathura Rd, New Delhi,DL-110003 \nTIMINGS: 9:00am - 4:30pm  " +
                    "Monday closed \nEntry Fee:Indians: Rs.10(Adults), " +
                    "Rs.5(Children from 5-12 years) and Foreigners: Rs.50(Adults)." +
                    "\nIt is stretches across 214 acres of land.\nThe park is home to several" +
                    " species of animals as well as various types of vegetation. " +
                    "\nIt offers a natural environment to over 2,000 birds and animals";
                break;
            case 18 : details="\n\nNehru Park, Delhi, is large park " +
                    "situated at Vinay Marg, Chanakyapuri Diplomatic Enclave of New Delhi," +
                    " DL-110021. \nNamed after India's first Prime Minister, " +
                    "Jawaharlal Nehru, the park is spread over an area of 80 acres,close to " +
                    "the heart of the city, and was established in 1969.";
                break;
            case 19 : details="\n\nThe Parliament House is" +
                    " located at Lok Sabha Marg, Gokul Nagar,Pandit Pant Marg Area, Central " +
                    "Secretariat, New Delhi, DL-110001. " +
                    "The Parliament House (Sansad Bhavan) is a circular building designed by" +
                    " the British architects Sir Edwin Lutyens and Sir Herbert Baker in 1912–1913";
                break;
            case 20 : details="\n\nIt is loacted at Mathura Rd," +
                    " Pragati Maidan New Delhi,DL-110002.\nIt‎ is a venue for large exhibitions " +
                    "and conventions in New Delhi, " +
                    "and with 72,000 sq. metres of exhibition space,it is Delhi's largest " +
                    "exhibition centre.\nIt is owned and managed by India Trade Promotion" +
                    " Organization (ITPO), Govt. of India.";
                break;
            case 21 : details="\nPurana Qila or the Old Fort is" +
                    " situated at Pragati Maidan,Mathura Rd,New Delhi,Delhi-110003 " +
                    "\nPhone:-011-23365358. \nPurana Quila standing stoically amidst wild greenery." +
                    "\nBuilt on the site of the most ancient of the numerous cities of Delhi, " +
                    "Indraprastha, Purana Quila is roughly rectangular in shape having a " +
                    "circuit of nearly two kilometers.";
                break;
            case 22 : details="\n\nQutab Minar is located near" +
                    " Mehrauli,New Delhi \nOpen Timimgs: 6:00 am – 6:00 pm.\nIt is a soaring," +
                    " 73 m-high tower of victory & is made of red sandstone and marble, " +
                    "built in 1193 by Qutab-ud-din Aibak immediately after the defeat of Delhi's " +
                    "last Hindu kingdom. \nThe tower has five distinct storeys, each marked by a" +
                    " projecting balcony and tapers from a 15 m diameter at the base to just " +
                    "2.5 m at the top. ";
                break;
            case 23 : details="\n\nRaj Ghat is located on the banks of " +
                    "Yamuna River \nOpen timimg: 5:30 am to 7 pm\nIt was built as a cenotaph for " +
                    "honouring Mahatma Gandhi. \nThere is a grave black marble podium at this site" +
                    " which is the spot of cremation of Mahatma Gandhi done on 31st January 1948";
                break;
            case 24 : details="\n\nRajPath is said commissioned India Gate " +
                    "and its surrounding area on Rajpath, RajRoad \nOpen Timing: 12:00 AM - 12:00 PM." +
                    " \nIt is the traditional avenue of there public Indian Republic day parade" +
                    " passes every year. " +
                    "\nIt boasts of decorative parks, pools and gardens along extends from the India" +
                    " Gate to Vijay Chowk, and Bhavan and National Stadium at two opposite ends.";
                break;
            case 25 : details="\n\nRashtrapati Bhavan(Presidential" +
                    " Residence) is the official home of the President of India. \nIt is situated" +
                    " in the Raisina Hills,Delhi \nPhone:- 011-23013287\nOpen Timings 9:00am to" +
                    " 4:00pm(Fri-Sun). " +
                    "\nIt may refer to only the mansion (the 340-room main building) that has the " +
                    "President's official residence, halls, guest rooms and offices. \nThe main" +
                    " palace building was formerly known as Viceroy's House.";
                break;
            case 26 : details="\n\nThe Red sandstone walls of massive " +
                    "Red Fort (Lal Qila) rise 33-m above the clamour of Old Delhi as a reminder" +
                    " of the magnificent power and emperors. \nThe pomp of the Mughal walls, " +
                    "built in 1638. " +
                    "\nThe main gate, Lahore Gate, is one of the emotional and symbolic focal" +
                    " points of the modern Indian nation and on crowd major attracts Independence Day";
                break;
            case 27 : details="\nThis gallery has done" +
                    " innovative shows in graphic design, drawings and sketches by Satyajit Ray, " +
                    "Mono-rints by women inmates of Tihar Jail and Haku Shah's homage to Gandhiji" +
                    " with straw, " +
                    "rags and cotton wool.\nAddress: 14, Hauz Khas Village, New Delhi. \nPhone.: 26853860" +
                    "\nTiming: 10.30 am to 6.30 pm";
                break;
            case 28 : details="\n\nThe Tibet House is located at " +
                    "Lodhi Rd,Institutional Area,Lodi Colony,New Delhi,DL-110003 " +
                    "\nPhone:- 011-24611515 \nOpen: 9:30 am To 5:30 pm Closed: Sat & Sun\nIt is a " +
                    "brilliant information offering a quick picture of the Tibetan history. " +
                    "\nThe Museum of Tibet house, holds an assortment of Tibetan artifacts that" +
                    " brought to India by Dalai Lama, when he escaped from the Tibetan lands.";
                break;
        }
        desc.setText(details);
    }

}

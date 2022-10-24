package com.xworkz.main;

import com.xworkz.dto.PersonDTO;
import com.xworkz.service.PersonService;
import com.xworkz.service.PersonServiceImpl;

public class PersonInvite {

	public static void main(String[] args) {

		
		/*PersonDTO person1=new PersonDTO(1, "Divya", "divyamc174@gmail.com", 9901391615L, "Female", "BE", "Unmarried","Notworking" , "TCS", 45000,25 ,1, "Bengaluru", "Btm", "karnataka", "India", 124578125874L, "A154872FJ2L", "yes", 457512521330L);
		PersonDTO person2=new PersonDTO(2,"Anushree","anushree@gmail.com",9901394789l,"Female","BE","married","working","google",450000.00,28,3,"USA","calofornia","karnataka","America",145698723697l,"g124588956h","yes",145789566693387l);
		PersonDTO person3=new PersonDTO(3, "Manjunath", "manju@gmail.com", 8784615624L, "male", "BE", "Unmarried","working" , "Accenture", 65000,29 ,5, "Bengaluru", "k r puram", "karnataka", "India", 1245781215874L, "A154882FJ2L", "yes", 457512458730L);
		PersonDTO person4=new PersonDTO(4, "Arun", "arun@gmail.com", 9901891615L, "male", "Bcom", "Unmarried","Notworking" , "TCS", 45000,30 ,1, "Bengaluru", "Btm", "karnataka", "India", 124578125874L, "A154872FJ2L", "yes", 457512521330L);
		PersonDTO person5=new PersonDTO(5, "Abhishek", "abhishek@gmail.com", 9771391615L, "male", "Bsc", "married","working" , "wipro", 45000,31 ,1, "Bengaluru", "Btm", "karnataka", "India", 124578125874L, "A154872FJ2L", "yes", 457512521330L);
		PersonDTO person6=new PersonDTO(6, "Nagarjun", "nagarjun@gmail.com", 9907391648L, "male", "Be", "Unmarried","working" , "TCS", 45000,39 ,1, "Bengaluru", "Btm", "karnataka", "India", 124578125874L, "A154872FJ2L", "yes", 457512521330L);
		PersonDTO person7=new PersonDTO(7, "Saraswathi", "saraswathi@gmail.com", 8901391615L, "Female", "BE", "Unmarried","Notworking" , "TCS", 45000,25 ,1, "Bengaluru", "Btm", "karnataka", "India", 124578125874L, "A154872FJ2L", "yes", 457512521330L);
		PersonDTO person8=new PersonDTO(8, "Anuraga", "anuraga@gmail.com", 9901314715L, "Female", "puc", "married","working" , "Accenture", 45000,45 ,1, "Bengaluru", "Btm", "karnataka", "India", 124578125874L, "A154872FJ2L", "yes", 457512521330L);
		PersonDTO person9=new PersonDTO(9, "Darshini", "darshini174@gmail.com", 9701391615L, "Female", "Bcom", "Unmarried","working" , "TCS", 45000,25 ,1, "Bengaluru", "Btm", "karnataka", "India", 124578125874L, "A154872FJ2L", "yes", 457512521330L);
		PersonDTO person10=new PersonDTO(10, "Harshitha","harshitha174@gmail.com", 9909391618L, "Female", "BE", "Unmarried","Notworking" , "TCS", 45000,47 ,1, "Bengaluru", "Btm", "karnataka", "India", 124578125874L, "A154872FJ2L", "yes", 457512521330L);
		PersonDTO person11=new PersonDTO(11, "Hema", "hema@gmail.com", 9901391148L, "Female", "mcom", "married","Notworking" , "Accenture", 57000,36 ,1, "Bengaluru", "Btm", "karnataka", "India", 12457858874L, "b154872FJ2L", "yes", 45751265899L);
		PersonDTO person12=new PersonDTO(12, "Indra", "indra@gmail.com", 9901398615L, "Female", "mtech", "Unmarried","Notworking" , "TCS", 63000,32 ,1, "Bengaluru", "jayanagar", "karnataka", "India", 1878578125878L, "A174872FJ2L", "yes", 4575125551330L);
		PersonDTO person13=new PersonDTO(13, "Arjun", "arjun@gmail.com", 8701391615L, "male", "BE", "married","Notworking" , "wipro", 95000,56 ,1, "Bengaluru", "hebbal", "karnataka", "India", 578478125874L, "A158872FJ2k", "yes", 569782521330L);
		PersonDTO person14=new PersonDTO(14, "Ganga", "ganga@gmail.com", 9661391615L, "Female", "BE", "Unmarried","working" , "TCS", 45000,28 ,1, "Bengaluru", "jayanagr", "karnataka", "India", 1245784875874L, "A1554772FJ2h", "yes", 4575125213355L);
		PersonDTO person15=new PersonDTO(15, "Netra", "netra177@gmail.com", 94401391615L, "Female", "bcom", "married","working" , "TCS", 84000,24 ,1, "Bengaluru", "Btm", "karnataka", "India", 1245788125874L, "A187872FJ2p", "yes", 4575552521330L);
		PersonDTO person16=new PersonDTO(16, "Boomika", "boomika4@gmail.com", 9901479161L, "Female", "puc", "married","working" , "wipro", 45000,23 ,1, "Bengaluru", "Btm", "karnataka", "India", 124878125874L, "k154872FJ2u", "yes", 455512521330L);
		PersonDTO person17=new PersonDTO(17, "Amaresh", "amaresh@gmail.com", 9901347615L, "male", "Bcom", "Unmarried","Notworking" , "wipro", 45000,29 ,1, "Bengaluru", "hoskere", "karnataka", "India", 124578125874L, "A1514772FJ2L", "yes", 568512521330L);
		PersonDTO person18=new PersonDTO(18, "Lokesh", "lokesh164@gmail.com", 9901391258L, "male", "mcom", "Unmarried","working" , "TCS", 45000,25 ,1, "Bengaluru", "silkboard", "karnataka", "India", 896778125874L, "m154872FJ2h", "yes", 457512521387L);
		PersonDTO person19=new PersonDTO(19, "Sushma", "sushma@gmail.com", 9901128715L, "Female", "Bsc", "Unmarried","working" , "TCS", 46000,25 ,1, "Bengaluru", "Btm", "karnataka", "India", 124578125857L, "A1545872FJ2L", "yes", 4565912521330L);
		PersonDTO person20=new PersonDTO(20, "Rajesh", "rajesh@gmail.com", 8001391615L, "male", "BA", "Unmarried","Notworking" , "Accenture", 45000,21 ,1, "Bengaluru", "vijayanagar", "karnataka", "India", 124578125874l, "r154872FJ2p", "yes", 4575125657330L);
		PersonDTO person21=new PersonDTO(21, "Manu", "manu@gmail.com", 9901395715L, "male", "BE", "married","Notworking" , "TCS", 45000,24 ,1, "Bengaluru", "maruthinagar", "karnataka", "India", 124578125974L, "A154872FJ2L", "yes", 4575165981330L);
		PersonDTO person22=new PersonDTO(22, "Nataraj", "nataraj@gmail.com", 9601391619L, "male", "BE", "Unmarried","Notworking" , "TCS", 45000,23 ,4, "Bengaluru", "kanakapura", "karnataka", "India", 124578185874L, "A197872FJ2L", "yes", 5877512521330L);
		PersonDTO person23=new PersonDTO(23, "Amarnath", "amarnath@gmail.com", 9981391615L, "male", "Bcom", "Unmarried","working" , "TCS", 45000,25 ,1, "Bengaluru", "hebbal", "karnataka", "India", 124578125874L, "s1548u2FJ2p", "yes", 4575159821330L);
		PersonDTO person24=new PersonDTO(24, "Kiran", "kiran@gmail.com", 9928139115L, "male", "BE", "Unmarried","Notworking" , "google", 45000,25 ,8, "Bengaluru", "Btm", "karnataka", "India", 396778125874L, "y154987FJ2i", "yes", 4575548721330L);
		PersonDTO person25=new PersonDTO(25, "Karan", "karan@gmail.com", 98801391618L, "male", "BE", "married","Notworking" , "TCS", 45000,25 ,1, "Bengaluru", "Btm", "karnataka", "India", 364878125874L, "f154857FJ2m", "yes", 4575126971330L);
		PersonDTO person26=new PersonDTO(26, "Charan", "charan@gmail.com", 8794544547L, "male", "Btech", "Unmarried","working" , "TCS", 45000,25 ,1, "Bengaluru", "eastend", "karnataka", "India", 978478125867L, "r154872FJ2u", "yes", 45782521330L);
		PersonDTO person27=new PersonDTO(27, "Chirag", "chirag@gmail.com", 9440136187L, "male", "BE", "Unmarried","working" , "TCS", 65000,25 ,1, "Bengaluru", "Btmwatertank", "karnataka", "India", 124478125874L, "r154879FJ2k", "yes", 45758713300L);
		PersonDTO person28=new PersonDTO(28, "Chandana", "chandana@gmail.com", 9901347615L, "male", "BE", "Unmarried","working" , "TCS", 45000,25 ,4, "Bengaluru", "Btm", "karnataka", "India", 578578125877L, "A154872FJ2p", "yes", 457512154730L);
		PersonDTO person29=new PersonDTO(29, "Santhosh", "santhosh@gmail.com", 8901391618L, "male", "BE", "married","working" , "google",75000,25 ,12, "Bengaluru", "Btm", "karnataka", "India", 578978125874L, "A154872FJ2L", "yes", 4575126598330L);
		PersonDTO person30=new PersonDTO(30, "Sangama", "sangama@gmail.com", 7901391654L, "male", "mtech", "married","working" , "google",45000,24 ,1, "Bengaluru", "Btm", "karnataka", "India", 569878125873L, "A154872FJ2L", "yes", 95912521330L);
		PersonDTO person31=new PersonDTO(31, "Shobha", "ahobha@gmail.com", 96013916187L, "Female", "BE", "Unmarried","working" , "TCS", 45000,25 ,1, "Bengaluru", "rarajinagar", "karnataka", "India", 124578725874L, "r155772FJ2L", "yes", 6575451330L);
		PersonDTO person32=new PersonDTO(32, "Jaganath", "jaganath@gmail.com", 9901891615L, "male", "Bcom", "married","working" , "google", 85000,23 ,1, "Bengaluru", "sunkankatte", "karnataka", "India", 987578125874L, "A15487ki22L", "yes", 45751245781330L);
		PersonDTO person33=new PersonDTO(33, "Mercy", "mercy@gmail.com", 9901391685L, "Female", "BE", "Unmarried","working" , "TCS", 85000,25 ,1, "Bengaluru", "shanthinagar", "karnataka", "India", 6487578125874L, "e154812FJ2u", "yes", 647812521330L);
		PersonDTO person34=new PersonDTO(34, "Murthy", "murthy100@gmail.com", 99013457615L, "male", "mcom", "married","working" , "google", 95000,25 ,10, "Bengaluru", "hanumathnagar", "karnataka", "India", 124578126987L, "A155482FJ2L", "yes", 148312521330L);
		PersonDTO person35=new PersonDTO(35, "Latha", "latha@gmail.com", 99013945815L, "Female", "BE", "married","working" , "TCS", 45000,25 ,1, "Bengaluru", "Btm", "karnataka", "India", 1245781257844L, "A578872FJ2L", "yes", 457516598330L);
		PersonDTO person36=new PersonDTO(36, "Lavanya", "lavanya@gmail.com", 9901394715L, "Female", "BE", "Unmarried","working" , "TCS", 35000,27 ,14, "Bengaluru", "nagarabhavi", "karnataka", "India", 1245785785874L, "k158772FJ2L", "yes", 457512581330L);
		PersonDTO person37=new PersonDTO(37, "Eshwar", "eshwar@gmail.com", 99013914785L, "male", "bsc", "married","working" , "TCS", 15000,25 ,1, "Bengaluru", "peenya", "karnataka", "India", 124575825874L, "A154784FJ2L", "yes", 457512527830L);
		PersonDTO person38=new PersonDTO(38, "Yuvika", "yuvika@gmail.com", 9901391585L, "Female", "bca", "Unmarried","Notworking" , "TCS", 65000,25 ,9, "Bengaluru", "Btm", "karnataka", "India", 124576725874L, "A1578872FJ2L", "yes", 457542521330L);
		PersonDTO person39=new PersonDTO(39, "Parakram", "para@gmail.com", 99013916478L, "male", "BE", "Unmarried","Notworking" , "TCS", 45000,25 ,1, "Bengaluru", "dasarahalli", "karnataka", "India", 974578125874L, "u154872FJ2k", "yes", 987512521330L);
		PersonDTO person40=new PersonDTO(40, "Pandith", "pandith@gmail.com", 9901395415L, "male", "BE", "married","Notworking" , "TCS", 85000,29 ,7, "Bengaluru", "Btm", "karnataka", "India", 394578125874L, "o1556872FJ2y", "yes", 96452521330L);
		PersonDTO person41=new PersonDTO(41, "Kavana", "kavana@gmail.com", 8701347615L, "Female", "BE", "Unmarried","working" , "TCS", 55000,25 ,1, "Bengaluru", "nagasandra", "karnataka", "India", 974578125874L, "A1548872FJ2L", "yes", 8745512521330L);
		PersonDTO person42=new PersonDTO(42, "Kavitha", "kavitha@gmail.com", 9901391145L, "Female", "bca", "married","Notworking" , "TCS", 45000,25 ,1, "Bengaluru", "Btm", "karnataka", "India", 544578125874L, "A1548787J2L", "yes", 457545781330L);
		PersonDTO person43=new PersonDTO(43, "Banu", "banu@gmail.com", 7401391619L, "Female", "BE", "Unmarried","working" , "google", 65000,21 ,1, "Bengaluru", "arohalli", "karnataka", "India", 994578125874L, "A1548759J2L", "yes", 648712521330L);
		PersonDTO person44=new PersonDTO(44, "Narendra", "narendra@gmail.com", 9661391619L, "male", "BE", "married","working" , "techMahendra", 45000,25 ,1, "Bengaluru", "jayanagar", "karnataka", "India", 584578125874L, "A1545759J2L", "yes", 36971221330L);
		PersonDTO person45=new PersonDTO(45, "Varshitha", "varshitha@gmail.com", 8891391619L, "Female", "BE", "Unmarried","working" , "AAA", 52000,27 ,6, "Bengaluru", "btm", "karnataka", "India", 694578125874L, "A1547759J2L", "yes", 2588712521330L);
		PersonDTO person46=new PersonDTO(46, "chaithra", "chaithra@gmail.com", 7401391259L, "Female", "BE", "Unmarried","working" , "BHEL", 65000,25 ,3, "Bengaluru", "banashankari", "karnataka", "India", 894578125874L, "A1548759J2L", "yes", 659712521330L);
		PersonDTO person47=new PersonDTO(47, "saravana", "saravana@gmail.com", 74013916658L, "male", "BE", "married","working" , "google", 65000,28 ,1, "Bengaluru", "arohalli", "karnataka", "India", 992578125877L, "A1528759J2L", "yes", 458712521330L);
		PersonDTO person48=new PersonDTO(48, "naveen", "naveen@gmail.com", 7401391679L, "male", "BE", "Unmarried","working" , "google", 65000,29 ,1, "Bengaluru", "koppal", "karnataka", "India", 994258125878L, "A1548753J2L", "yes", 36912521330L);
		PersonDTO person49=new PersonDTO(49, "abhinav", "abhinav@gmail.com", 9441391619L, "male", "Bcom", "Unmarried","notworking" , "google", 65000,25 ,1, "Bengaluru", "arohalli", "karnataka", "India", 994578125974L, "A1543759J2L", "yes", 6569712521330L);
		PersonDTO person50=new PersonDTO(50, "bhargav", "bhargav@gmail.com", 7401391658L, "male", "Bsc", "Unmarried","working" , "BEL", 65000,26 ,2, "Bengaluru", "ballery", "karnataka", "India", 994578125884L, "A3348759J2L", "yes", 968712521330L);
		PersonDTO person51=new PersonDTO(51, "sheela", "sheela@gmail.com", 8013916187L, "Female", "BE", "Unmarried","working" , "google", 65000,25 ,1, "Bengaluru", "gadag", "karnataka", "India", 994578565876L, "k1548759J2L", "yes", 123712521330L);
		PersonDTO person52=new PersonDTO(52, "jayanth", "jayanth@gmail.com", 9601391658L, "male", "BA", "Unmarried","notworking" , "google", 65000,25 ,1, "Bengaluru", "arohalli", "karnataka", "India", 994478125878L, "l1548759J2L", "yes", 485712521330L);
		PersonDTO person53=new PersonDTO(53, "karthik", "karthik@gmail.com", 6601391619L, "male", "BE", "Unmarried","working" , "BEML", 45000,28 ,1, "Bengaluru", "chamarajnagar", "karnataka", "India", 9569578128874L, "u1548759J2L", "yes", 239712521330L);
		PersonDTO person54=new PersonDTO(54, "kanaka", "kanaka@gmail.com", 8881391619L, "male", "BCA", "married","working" , "google", 25000,21 ,1, "Bengaluru", "arohalli", "karnataka", "India", 3994578125564L, "A1548752J2L", "yes", 639712521330L);
		PersonDTO person55=new PersonDTO(55, "ramappa", "ramappa@gmail.com", 7401391628L, "male", "BE", "Unmarried","working" , "google", 65000,25 ,4, "Bengaluru", "mysore", "karnataka", "India", 2784578122574L, "A1545759J3L", "yes", 987712521330L);
		PersonDTO person56=new PersonDTO(56, "billappa", "billappa@gmail.com", 8745391619L, "male", "BE", "Unmarried","working" , "google", 65000,25 ,1, "Bengaluru", "arohalli", "karnataka", "India", 994575825874L, "l4548759J2L", "yes",111712521330L);
		PersonDTO person57=new PersonDTO(57, "lorel", "lorel@gmail.com", 7401392356L, "Female", "MCA", "Unmarried","working" , "BEML", 65000,26 ,5, "Bengaluru", "hubbli", "karnataka", "India", 65357812564L, "ly548759J2L", "yes", 369712521330L);
		PersonDTO person58=new PersonDTO(58, "madhan", "madhan@gmail.com", 9631391619L, "male", "BE", "Unmarried","working" , "google", 55000,25 ,1, "Bengaluru", "arohalli", "karnataka", "India", 994578155874L, "h6548759J2L", "yes", 369712521330L);
		PersonDTO person59=new PersonDTO(59, "umesh", "umesh@gmail.com", 7407391619L, "male", "MTECH", "married","working" , "Suzuki", 65000,30 ,9, "Bengaluru", "arohalli", "karnataka", "India", 245578122874L, "l9548759J2L", "yes", 258712521330L);
		PersonDTO person60=new PersonDTO(60, "kallesh", "kallesh@gmail.com", 9661391619L, "male", "Btech", "Unmarried","working" , "google", 65000,25 ,1, "Bengaluru", "dhrvad", "karnataka", "India", 369578125874L, "h1548759J3L", "yes", 21548712521330L);
		PersonDTO person61=new PersonDTO(61, "narayan", "narayan@gmail.com", 7401391625L, "male", "BCom", "Unmarried","working" , "google", 65000,35 ,5, "Bengaluru", "arohalli", "karnataka", "India", 659578125874L, "A1548789J2L", "yes", 2358712521330L);
		PersonDTO person62=new PersonDTO(62, "basappa", "basappa@gmail.com", 9751391619L, "male", "BE", "married","working" , "HCL", 63000,25 ,4, "Bengaluru", "kasaragudu", "karnataka", "India", 194578125874L, "A1548779J2L", "yes", 2369712521330L);
		PersonDTO person63=new PersonDTO(63, "ganavi", "ganavi@gmail.com", 7401391613L, "Female", "BE", "Unmarried","notworking" , "google", 65000,38 ,1, "Bengaluru", "arohalli", "karnataka", "India", 694578125874L, "A1548759J2L", "yes", 458712521330L);
		PersonDTO person64=new PersonDTO(64, "vanitha", "vanitha@gmail.com", 8401791619L, "Female", "BE", "Unmarried","working" , "HCL", 65000,25 ,3, "Bengaluru", "arohalli", "karnataka", "India", 324578122874L, "g1548759J2L", "yes", 124512521330L);
		PersonDTO person65=new PersonDTO(65, "nayana", "nayana@gmail.com", 9601391619L, "Female", "BCom", "Unmarried","working" , "google", 65000,25 ,1, "Bengaluru", "arohalli", "karnataka", "India", 994578125874L, "A1548659J2L", "yes", 125812521330L);
		PersonDTO person66=new PersonDTO(66, "abhilash", "abhilash@gmail.com", 971391619L, "male", "BSc", "married","working" , "google", 75000,45 ,5, "Bengaluru", "chitralli", "karnataka", "India", 564578175874L, "A2548759J2L", "yes", 648712521329L);
		PersonDTO person67=new PersonDTO(67, "renuka", "renuka@gmail.com", 74013916587L, "Female", "BE", "Unmarried","working" , "BEML", 65000,52 ,1, "Bengaluru", "arohalli", "karnataka", "India", 544572325874L, "p1548759J2L", "yes", 648712521323L);
		PersonDTO person68=new PersonDTO(68, "davan", "davan@gmail.com", 9401391618L, "male", "BE", "Unmarried","working" , "google", 2000,25 ,1, "Bengaluru", "arohalli", "karnataka", "India", 364578125874L, "v1548759J2L", "yes", 648712521328L);
		PersonDTO person69=new PersonDTO(69, "drithi", "drithi@gmail.com", 9401391663L, "male", "MSC", "Unmarried","working" , "google", 65000,56 ,4, "Bengaluru", "davangere", "karnataka", "India", 524578125874L, "k3548759J2L", "yes", 648712521323L);
		PersonDTO person70=new PersonDTO(70, "devanaga", "devanga@gmail.com", 7401391671L, "male", "BE", "married","working" , "BEL", 45000,48 ,8, "Bengaluru", "arohalli", "karnataka", "India", 29578125874L, "k9548759J2L", "yes", 648712521328L);
		PersonDTO person71=new PersonDTO(71, "prathap", "prathap@gmail.com", 7401391623L, "Female", "ITI", "Unmarried","notworking" , "google", 65000,25 ,1, "Bengaluru", "arohalli", "karnataka", "India", 364578125874L, "la548759J2L", "yes", 648712521328L);
		PersonDTO person72=new PersonDTO(72, "mallamma", "mallamma@gmail.com", 9601391619L, "Female", "BE", "married","working" , "google", 36000,25 ,1, "Bengaluru", "udupi", "karnataka", "India", 284578125874L, "t1548759J2L", "yes", 6487125213239L);
		PersonDTO person73=new PersonDTO(73, "pratham", "pratham@gmail.com", 7401391623L, "male", "BSC", "Unmarried","working" , "home", 65000,56 ,9, "Bengaluru", "arohalli", "karnataka", "India", 364578125874L, "k1548759J2L", "yes", 648712521328L);
		PersonDTO person74=new PersonDTO(74, "latha", "latha@gmail.com", 95013916123L, "Female", "BE", "Unmarried","working" , "wipro", 65000,23 ,5, "Bengaluru", "varthur", "karnataka", "India", 284578125874L, "A154875232L", "yes", 648712521323L);
		PersonDTO person75=new PersonDTO(75, "vinay", "vinay@gmail.com", 9501391614L, "male", "BE", "married","working" , "Infosys", 30000,21 ,2, "Bengaluru", "btm", "karnataka", "India", 394578125874L, "f15487289J2L", "yes", 6487125213569L);

																
																													
		
		PersonService personService=new PersonServiceImpl();
		personService.validateAndSave(person1);
		personService.validateAndSave(person2);
		personService.validateAndSave(person3);
		personService.validateAndSave(person4);
		personService.validateAndSave(person5);
		personService.validateAndSave(person6);
		personService.validateAndSave(person7);
		personService.validateAndSave(person8);
		personService.validateAndSave(person9);
		personService.validateAndSave(person10);
		personService.validateAndSave(person11);
		personService.validateAndSave(person12);
		personService.validateAndSave(person13);
		personService.validateAndSave(person14);
		personService.validateAndSave(person15);
		personService.validateAndSave(person16);
		personService.validateAndSave(person17);
		personService.validateAndSave(person18);
		personService.validateAndSave(person19);
		personService.validateAndSave(person20);
		personService.validateAndSave(person21);
		personService.validateAndSave(person22);
		personService.validateAndSave(person23);
		personService.validateAndSave(person24);
		personService.validateAndSave(person25);
		personService.validateAndSave(person26);
		personService.validateAndSave(person27);
		personService.validateAndSave(person28);
		personService.validateAndSave(person29);
		personService.validateAndSave(person30);
		personService.validateAndSave(person31);
		personService.validateAndSave(person32);
		personService.validateAndSave(person33);
		personService.validateAndSave(person34);
		personService.validateAndSave(person35);
		personService.validateAndSave(person36);
		personService.validateAndSave(person37);
		personService.validateAndSave(person38);
		personService.validateAndSave(person39);
		personService.validateAndSave(person40);
		personService.validateAndSave(person41);
		personService.validateAndSave(person42);
		personService.validateAndSave(person43);
		personService.validateAndSave(person44);
		personService.validateAndSave(person45);
		personService.validateAndSave(person46);
		personService.validateAndSave(person47);
		personService.validateAndSave(person48);
		personService.validateAndSave(person49);
		personService.validateAndSave(person50);
		personService.validateAndSave(person51);
		personService.validateAndSave(person52);
		personService.validateAndSave(person53);
		personService.validateAndSave(person54);
		personService.validateAndSave(person55);
		personService.validateAndSave(person56);
		personService.validateAndSave(person57);
		personService.validateAndSave(person58);
		personService.validateAndSave(person59);
		personService.validateAndSave(person60);
		personService.validateAndSave(person61);
		personService.validateAndSave(person62);
		personService.validateAndSave(person63);
		personService.validateAndSave(person64);
		personService.validateAndSave(person65);
		personService.validateAndSave(person66);
		personService.validateAndSave(person67);
		personService.validateAndSave(person68);
		personService.validateAndSave(person69);
		personService.validateAndSave(person70);
		personService.validateAndSave(person71);
		personService.validateAndSave(person72);
		personService.validateAndSave(person73);
		personService.validateAndSave(person74);
		personService.validateAndSave(person75);*/
		
		
		
		PersonService service=new PersonServiceImpl();
		service.displayAll();
		
		
		PersonService service1=new PersonServiceImpl();
		service1.displayAllAgeGreaterThanOrderByName(28);
		
		PersonService service2=new PersonServiceImpl();
		service2.displayAllByGenderDescOrderByName("Female");
		
		PersonService service3=new PersonServiceImpl();
		service3.displayAllBySalaryGreaterThanOrderByDesc(85000.0);
		
		PersonService service4=new PersonServiceImpl();
		service4.displayCount();
		
		PersonService service5=new PersonServiceImpl();
		service5.displaySumOfSalary();;
		
		
	}

}

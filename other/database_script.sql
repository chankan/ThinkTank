
--
-- Database: `thinktank`
--

-- --------------------------------------------------------

--
-- Table structure for table `Donation_Ticket_Details`
--

CREATE TABLE IF NOT EXISTS `Donation_Ticket_Details` (
  `Ticket_ID` int(4) DEFAULT NULL,
  `Ticket_Raised_By` varchar(15) DEFAULT NULL,
  `Ticket_Details` varchar(33) DEFAULT NULL,
  `Ticket_Severity` varchar(6) DEFAULT NULL,
  `Ticket_Creation_Date` varchar(10) DEFAULT NULL,
  `Ticket_Created_By` varchar(5) DEFAULT NULL,
  `Ticket_Status` varchar(4) DEFAULT NULL,
  `Ticket_Raised_To` varchar(15) DEFAULT NULL,
  `Comments` varchar(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `Donation_Ticket_Details`
--

INSERT INTO `Donation_Ticket_Details` (`Ticket_ID`, `Ticket_Raised_By`, `Ticket_Details`, `Ticket_Severity`, `Ticket_Creation_Date`, `Ticket_Created_By`, `Ticket_Status`, `Ticket_Raised_To`, `Comments`) VALUES
(9000, 'Hospital', 'New ticket for platelets donation', 'High', '2015-01-31', 'Admin', 'Open', 'Donation Center', 'New ticket'),
(9001, 'Hospital', 'New ticket for platelets donation', 'High', '2015-01-31', 'Admin', 'Open', 'Donation Center', 'New ticket'),
(9002, 'Donation Center', 'New ticket for platelets donation', 'Medium', '2015-01-31', 'Admin', 'Open', 'Donation Center', 'New ticket'),
(9003, 'Donation Center', 'New ticket for platelets donation', 'Low', '2015-01-31', 'Admin', 'Open', 'Donation Center', 'New ticket'),
(9004, 'Individual', 'New ticket for platelets donation', 'Low', '2015-01-31', 'Admin', 'Open', 'Donation Center', 'New ticket'),
(9005, 'hospital 12', 'plat 1', 'Low', '', '', 'Open', 'person', 'New Request');

-- --------------------------------------------------------

--
-- Table structure for table `Donor_Clinical_Details`
--

CREATE TABLE IF NOT EXISTS `Donor_Clinical_Details` (
  `Donor_Clinical_ID` int(4) DEFAULT NULL,
  `Donor_Details_ID` int(4) DEFAULT NULL,
  `DOB` varchar(10) DEFAULT NULL,
  `Sex` varchar(1) DEFAULT NULL,
  `Weight` int(2) DEFAULT NULL,
  `Last_Platletes_Donation_Date` varchar(10) DEFAULT NULL,
  `Last_Blood_Donation_Date` varchar(10) DEFAULT NULL,
  `Status` int(1) DEFAULT NULL,
  `Is_Suffering_From_Diseases` int(1) DEFAULT NULL,
  `Is_Drug_Consumption` int(1) DEFAULT NULL,
  `Is_Pregnancy_Symptoms` int(1) DEFAULT NULL,
  `Hemoglobin_Level` int(2) DEFAULT NULL,
  `Comments` varchar(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `Donor_Clinical_Details`
--

INSERT INTO `Donor_Clinical_Details` (`Donor_Clinical_ID`, `Donor_Details_ID`, `DOB`, `Sex`, `Weight`, `Last_Platletes_Donation_Date`, `Last_Blood_Donation_Date`, `Status`, `Is_Suffering_From_Diseases`, `Is_Drug_Consumption`, `Is_Pregnancy_Symptoms`, `Hemoglobin_Level`, `Comments`) VALUES
(3000, 2001, '1976-01-01', 'M', 67, '2013-11-11', '', 1, 0, 0, 0, 25, 'donor'),
(3001, 2009, '1973-01-01', 'F', 24, '2014-11-11', '', 1, 0, 0, 0, 25, 'donor'),
(3002, 2006, '1977-01-01', 'F', 24, '2014-11-11', '', 1, 0, 0, 1, 25, 'donor'),
(3003, 2005, '1979-01-01', 'F', 34, '2014-11-09', '', 1, 1, 0, 0, 25, 'donor'),
(3004, 2003, '1989-01-01', 'F', 35, '2014-01-09', '', 1, 0, 1, 0, 25, 'donor'),
(3005, 2004, '1989-01-11', 'M', 30, '2015-01-01', '', 0, 0, 0, 0, 25, 'donor');

-- --------------------------------------------------------

--
-- Table structure for table `Donor_Details`
--

CREATE TABLE IF NOT EXISTS `Donor_Details` (
  `Donor_Details_ID` int(4) DEFAULT NULL,
  `Donor_Name` varchar(12) DEFAULT NULL,
  `Donor_Office_Address` varchar(22) DEFAULT NULL,
  `Donor_Office_City` varchar(11) DEFAULT NULL,
  `Donor_Office_State` varchar(11) DEFAULT NULL,
  `Donor_Office_Pin_Code` int(6) DEFAULT NULL,
  `Donor_Home_Address` varchar(22) DEFAULT NULL,
  `Donor_Home_City` varchar(11) DEFAULT NULL,
  `Donor_Home_State` varchar(11) DEFAULT NULL,
  `Donor_Home_Pin_Code` int(6) DEFAULT NULL,
  `Donor_Office_Map_LI` decimal(7,5) DEFAULT NULL,
  `Donor_Office_Map_LA` decimal(7,5) DEFAULT NULL,
  `Donor_Home_Map_LI` decimal(7,5) DEFAULT NULL,
  `Donor_Home_Map_LA` decimal(7,5) DEFAULT NULL,
  `Donor_Primary_Phone_No` int(8) DEFAULT NULL,
  `Donor_Secondary_Phone_No` int(8) DEFAULT NULL,
  `Donor_Email_Address` varchar(20) DEFAULT NULL,
  `Donor_Blood_Group` varchar(2) DEFAULT NULL,
  `Donor_Type` varchar(9) DEFAULT NULL,
  `Last_Donation_Date` varchar(10) DEFAULT NULL,
  `Comments` varchar(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `Donor_Details`
--

INSERT INTO `Donor_Details` (`Donor_Details_ID`, `Donor_Name`, `Donor_Office_Address`, `Donor_Office_City`, `Donor_Office_State`, `Donor_Office_Pin_Code`, `Donor_Home_Address`, `Donor_Home_City`, `Donor_Home_State`, `Donor_Home_Pin_Code`, `Donor_Office_Map_LI`, `Donor_Office_Map_LA`, `Donor_Home_Map_LI`, `Donor_Home_Map_LA`, `Donor_Primary_Phone_No`, `Donor_Secondary_Phone_No`, `Donor_Email_Address`, `Donor_Blood_Group`, `Donor_Type`, `Last_Donation_Date`, `Comments`) VALUES
(2002, 'Sunder Kumar', 'Parel', 'Mumbai', 'Maharashtra', 400987, 'Fort', 'Mumbai', 'Maharashtra', 400987, '72.83899', '18.99449', '72.83715', '18.93526', 27816734, 27812251, 'sunder@hotmail.com', 'B+', 'Platelets', '2013-11-11', 'Donor'),
(2003, 'Anant Das', 'Koper Khairane', 'Navi Mumbai', 'Maharashtra', 400987, 'Bhandup', 'Mumbai', 'Maharashtra', 400987, '73.00900', '19.10277', '72.93113', '19.14990', 27816734, 27812251, 'anantd@hotmail.com', 'B+', 'Platelets', '2013-11-11', 'Donor'),
(2004, 'Suryakumar', 'Vashi', 'Navi Mumbai', 'Maharashtra', 400987, 'Bandra', 'Mumbai', 'Maharashtra', 400987, '72.99899', '19.07706', '72.83625', '19.06069', 27816734, 27812251, 'skumar@hotmail.com', 'B+', 'Platelets', '2013-10-10', 'Donor'),
(2005, 'Priya Kumari', 'Vashi', 'Navi Mumbai', 'Maharashtra', 400987, 'Mumbai', 'Mumbai', 'Maharashtra', 400987, '72.99899', '19.07706', '72.93113', '19.14990', 27816734, 27812251, 'priyak@hotmail.com', 'AB', 'Blood', '2013-09-10', 'Donor'),
(2006, 'Mala Singh', 'Mumbai', 'Mumbai', 'Maharashtra', 400987, 'Vashi', 'Navi Mumbai', 'Maharashtra', 400987, '72.93113', '19.14990', '72.99899', '19.07706', 27816734, 27812251, 'mala@yahoo.com', 'A+', 'Blood', '2014-08-08', 'Donor'),
(2007, 'Tasleem Khan', 'Mumbai', 'Mumbai', 'Maharashtra', 400987, 'Marol Maroshi, Andheri', 'Mumbai', 'Maharashtra', 400987, '72.93113', '19.14990', '72.86973', '19.11365', 27816734, 27812251, 'tk@yahoo.com', 'A+', 'Platelets', '2014-12-08', 'Donor'),
(2008, 'Kiran Kumar', 'Bandra', 'Mumbai', 'Maharashtra', 400987, 'Parel', 'Mumbai', 'Maharashtra', 400987, '72.83625', '19.06069', '72.83899', '18.99449', 27816734, 27812251, 'kkumar@yahoo.com', 'A+', 'Platelets', '2014-12-12', 'Donor'),
(2009, 'Swati Singh', 'Marol Maroshi, Andheri', 'Mumbai', 'Maharashtra', 400987, 'Marol Maroshi, Andheri', 'Mumbai', 'Maharashtra', 400987, '72.83899', '19.11365', '72.83899', '19.11365', 27816734, 27812251, 'swatisingh@yahoo.com', 'B+', 'Platelets', '2014-02-12', 'Donor'),
(2010, 'Virat Singh', 'Mumbai', 'Mumbai', 'Maharashtra', 400987, 'Sion', 'Mumbai', 'Maharashtra', 400987, '72.93113', '19.14990', '72.86190', '19.03902', 27816734, 27812251, 'virat@yahoo.com', 'B+', 'Blood', '2014-02-12', 'Donor');

-- --------------------------------------------------------

--
-- Table structure for table `Donor_Donation_Status`
--

CREATE TABLE IF NOT EXISTS `Donor_Donation_Status` (
  `Donor_Donation_Status_ID` int(4) DEFAULT NULL,
  `Donor_Details_ID` int(4) DEFAULT NULL,
  `Donor_Clinical_ID` int(4) DEFAULT NULL,
  `Hospital_ID` int(4) DEFAULT NULL,
  `Ticket_ID` int(4) DEFAULT NULL,
  `Donation_Type` varchar(9) DEFAULT NULL,
  `Status` int(1) DEFAULT NULL,
  `Comments` varchar(13) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `Donor_Donation_Status`
--

INSERT INTO `Donor_Donation_Status` (`Donor_Donation_Status_ID`, `Donor_Details_ID`, `Donor_Clinical_ID`, `Hospital_ID`, `Ticket_ID`, `Donation_Type`, `Status`, `Comments`) VALUES
(8000, 2001, 3000, 1000, 9000, 'Platelets', 1, 'Available'),
(8001, 2003, 3004, 1000, 9003, 'Platelets', 0, 'Not Available'),
(8002, 2007, 3005, 1013, 9002, 'Blood', 0, 'Not Available'),
(8003, 2006, 3003, 1006, 9004, 'Platelets', 1, 'Available');

-- --------------------------------------------------------

--
-- Table structure for table `Hospital_Master`
--

CREATE TABLE IF NOT EXISTS `Hospital_Master` (
  `Hospital_ID` int(4) DEFAULT NULL,
  `Name` varchar(32) DEFAULT NULL,
  `Address` varchar(22) DEFAULT NULL,
  `City` varchar(11) DEFAULT NULL,
  `State` varchar(11) DEFAULT NULL,
  `Pin_Code` int(6) DEFAULT NULL,
  `Map_LI` decimal(7,5) DEFAULT NULL,
  `Map_LA` decimal(7,5) DEFAULT NULL,
  `Primary_Phone_No` int(8) DEFAULT NULL,
  `Secondary_Phone_No` int(8) DEFAULT NULL,
  `Is_DonnationCenter` int(1) DEFAULT NULL,
  `Comments` varchar(29) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `Hospital_Master`
--

INSERT INTO `Hospital_Master` (`Hospital_ID`, `Name`, `Address`, `City`, `State`, `Pin_Code`, `Map_LI`, `Map_LA`, `Primary_Phone_No`, `Secondary_Phone_No`, `Is_DonnationCenter`, `Comments`) VALUES
(1001, 'Lokmanya Tilak Hospital', 'Sion', 'Mumbai', 'Maharahstra', 400103, '72.86190', '19.03902', 24451515, 24449199, 1, 'This is a donation center'),
(1002, 'Hiranandani Hospital', 'Near IIT Powai', 'Mumbai', 'Maharahstra', 400056, '72.91327', '19.13343', 26212297, 26206493, 0, 'This is not a donation center'),
(1003, 'Fortis Hiranandani Hospital', 'Vashi', 'Navi Mumbai', 'Maharahstra', 400037, '72.99899', '19.07706', 28932461, 28933740, 0, 'This is not a donation center'),
(1004, 'Global Hospital', 'Kalyan', 'Thane', 'Maharahstra', 400987, '73.12956', '19.24249', 24145573, 24145573, 1, 'This is a donation center'),
(1005, 'Hinduja Hospital', 'Mumbai', 'Mumbai', 'Maharahstra', 400987, '72.87766', '19.07598', 24920030, 24920030, 1, 'This is a donation center'),
(1006, 'Jupiter Hospital', 'Thane', 'Thane', 'Maharahstra', 400088, '72.97809', '19.21833', 23820909, 23820909, 1, 'This is a donation center'),
(1007, 'Cama Blood Bank \r', 'Sion', 'Mumbai', 'Maharahstra', 400034, '72.86190', '19.03902', 27816734, 23829308, 1, 'This is a donation center'),
(1008, 'Sunrise Hospital', 'Bhandup', 'Mumbai', 'Maharahstra', 400987, '72.93113', '19.14990', 25564069, 25564071, 0, 'This is not a donation center'),
(1009, 'KEM Hospital', 'Parel', 'Mumbai', 'Maharahstra', 400016, '72.83899', '18.99449', 24467570, 24467569, 1, 'This is a donation center'),
(1010, 'SevenHills Hospital & HealthCity', 'Marol Maroshi, Andheri', 'Mumbai', 'Maharahstra', 400987, '72.86973', '19.11365', 27816734, 27812251, 1, 'This is a donation center'),
(1011, 'Rajpal Hospital & Institute', 'Koper Khairane', 'Navi Mumbai', 'Maharahstra', 400987, '73.00900', '19.10277', 27816734, 27812251, 1, 'This is a donation center'),
(1012, 'Kalsekar Hospital', 'Mumbra', 'Thane', 'Maharahstra', 400016, '73.02134', '19.18642', 27816734, 27812251, 0, 'This is not a donation center'),
(1013, 'Lilavati Hospital', 'Bandra', 'Mumbai', 'Maharahstra', 400987, '72.83625', '19.06069', 27816734, 27812251, 1, 'This is a donation center'),
(1014, 'Gokuldas Tejpal Hospital', 'Fort', 'Mumbai', 'Maharahstra', 400987, '72.83715', '18.93526', 27816734, 27812251, 1, 'This is a donation center'),
(1015, 'Jaslok Hospital', 'Pedar Road', 'Mumbai', 'Maharahstra', 400034, '72.80735', '18.96825', 27816734, 27812251, 1, 'This is a donation center');

-- --------------------------------------------------------

--
-- Table structure for table `Platlets_Donation_Details`
--

CREATE TABLE IF NOT EXISTS `Platlets_Donation_Details` (
  `Platlets_Donation_Details_ID` int(4) DEFAULT NULL,
  `Hospital_ID` int(4) DEFAULT NULL,
  `Donor_Details_ID` int(4) DEFAULT NULL,
  `Donor_Clinical_ID` int(4) DEFAULT NULL,
  `Ticket_ID` int(4) DEFAULT NULL,
  `Donation_Date` varchar(10) DEFAULT NULL,
  `Donation_Type` varchar(9) DEFAULT NULL,
  `Comments` varchar(8) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `Platlets_Donation_Details`
--

INSERT INTO `Platlets_Donation_Details` (`Platlets_Donation_Details_ID`, `Hospital_ID`, `Donor_Details_ID`, `Donor_Clinical_ID`, `Ticket_ID`, `Donation_Date`, `Donation_Type`, `Comments`) VALUES
(4000, 1000, 2001, 3000, 9000, '2015-02-02', 'Platelets', 'Comments'),
(4001, 1010, 2003, 3004, 9003, '2015-02-02', 'Platelets', 'Comments'),
(4002, 1013, 2007, 3005, 9002, '2015-02-02', 'Blood', 'Comments'),
(4003, 1006, 2006, 3003, 9004, '2015-02-02', 'Platelets', 'Comments');

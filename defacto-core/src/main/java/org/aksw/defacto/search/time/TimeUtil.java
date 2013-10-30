/**
 * 
 */
package org.aksw.defacto.search.time;

import java.util.LinkedHashMap;
import java.util.Map;

import com.github.gerbsen.math.Frequency;

/**
 * @author Daniel Gerber <dgerber@informatik.uni-leipzig.de>
 *
 */
public class TimeUtil {

	public static Map<Integer,Long> years = new LinkedHashMap<>();
	public static Long sum = 0L;
	public static Double average = 0D; 
	
	public static Frequency allYears = new Frequency();
	public static Frequency allYearsAndTimePeriod = new Frequency();
	
	public static double getGlobalNormalizedPopularity(Integer year) {
		
		long count = years.containsKey(year) ? years.get(year) : Integer.MIN_VALUE; 
		return count / ((1 / (double) years.size()) * sum);
	}
	
	public static void main(String[] args) {
		
		System.out.println("1972: " + getGlobalNormalizedPopularity(1972));
		System.out.println("1312: " + getGlobalNormalizedPopularity(1312));
		System.out.println("1776: " + getGlobalNormalizedPopularity(1776));
		System.out.println("2013: " + getGlobalNormalizedPopularity(2013));
	}
	
	static {
		
		years.put(1000, 3610000000L);
		years.put(1001, 361000000L);
		years.put(1002, 140000000L);
		years.put(1003, 163000000L);
		years.put(1004, 167000000L);
		years.put(1005, 131000000L);
		years.put(1006, 118000000L);
		years.put(1007, 118000000L);
		years.put(1008, 114000000L);
		years.put(1009, 98300000L);
		years.put(1010, 217000000L);
		years.put(1011, 162000000L);
		years.put(1012, 150000000L);
		years.put(1013, 96100000L);
		years.put(1014, 92000000L);
		years.put(1015, 148000000L);
		years.put(1016, 109000000L);
		years.put(1017, 125000000L);
		years.put(1018, 132000000L);
		years.put(1019, 87300000L);
		years.put(1020, 184000000L);
		years.put(1021, 134000000L);
		years.put(1022, 122000000L);
		years.put(1023, 87400000L);
		years.put(1024, 2730000000L);
		years.put(1025, 111000000L);
		years.put(1026, 79300000L);
		years.put(1027, 109000000L);
		years.put(1028, 79600000L);
		years.put(1029, 115000000L);
		years.put(1030, 150000000L);
		years.put(1031, 79100000L);
		years.put(1032, 76200000L);
		years.put(1033, 88300000L);
		years.put(1034, 102000000L);
		years.put(1035, 95200000L);
		years.put(1036, 104000000L);
		years.put(1037, 73900000L);
		years.put(1038, 102000000L);
		years.put(1039, 73800000L);
		years.put(1040, 129000000L);
		years.put(1041, 77300000L);
		years.put(1042, 98600000L);
		years.put(1043, 81600000L);
		years.put(1044, 106000000L);
		years.put(1045, 112000000L);
		years.put(1046, 71800000L);
		years.put(1047, 80400000L);
		years.put(1048, 72300000L);
		years.put(1049, 74500000L);
		years.put(1050, 313000000L);
		years.put(1051, 110000000L);
		years.put(1052, 101000000L);
		years.put(1053, 99300000L);
		years.put(1054, 102000000L);
		years.put(1055, 111000000L);
		years.put(1056, 78200000L);
		years.put(1057, 80000000L);
		years.put(1058, 69700000L);
		years.put(1059, 68900000L);
		years.put(1060, 106000000L);
		years.put(1061, 105000000L);
		years.put(1062, 84100000L);
		years.put(1063, 82400000L);
		years.put(1064, 79600000L);
		years.put(1065, 101000000L);
		years.put(1066, 91100000L);
		years.put(1067, 131000000L);
		years.put(1068, 86800000L);
		years.put(1069, 72800000L);
		years.put(1070, 126000000L);
		years.put(1071, 102000000L);
		years.put(1072, 71000000L);
		years.put(1073, 81300000L);
		years.put(1074, 80800000L);
		years.put(1075, 110000000L);
		years.put(1076, 69200000L);
		years.put(1077, 82900000L);
		years.put(1078, 68000000L);
		years.put(1079, 93000000L);
		years.put(1080, 307000000L);
		years.put(1081, 74200000L);
		years.put(1082, 80100000L);
		years.put(1083, 69600000L);
		years.put(1084, 67500000L);
		years.put(1085, 73000000L);
		years.put(1086, 78400000L);
		years.put(1087, 92100000L);
		years.put(1088, 115000000L);
		years.put(1089, 67300000L);
		years.put(1090, 92600000L);
		years.put(1091, 68700000L);
		years.put(1092, 840000000L);
		years.put(1093, 117000000L);
		years.put(1094, 92900000L);
		years.put(1095, 103000000L);
		years.put(1096, 92400000L);
		years.put(1097, 65100000L);
		years.put(1098, 103000000L);
		years.put(1099, 118000000L);
		years.put(1100, 520000000L);
		years.put(1101, 113000000L);
		years.put(1102, 130000000L);
		years.put(1103, 83800000L);
		years.put(1104, 84900000L);
		years.put(1105, 120000000L);
		years.put(1106, 78900000L);
		years.put(1107, 112000000L);
		years.put(1108, 91800000L);
		years.put(1109, 114000000L);
		years.put(1110, 109000000L);
		years.put(1111, 220000000L);
		years.put(1112, 128000000L);
		years.put(1113, 108000000L);
		years.put(1114, 73800000L);
		years.put(1115, 78000000L);
		years.put(1116, 108000000L);
		years.put(1117, 101000000L);
		years.put(1118, 87700000L);
		years.put(1119, 102000000L);
		years.put(1120, 152000000L);
		years.put(1121, 77400000L);
		years.put(1122, 115000000L);
		years.put(1123, 105000000L);
		years.put(1124, 99400000L);
		years.put(1125, 131000000L);
		years.put(1126, 82300000L);
		years.put(1127, 78500000L);
		years.put(1128, 70700000L);
		years.put(1129, 71800000L);
		years.put(1130, 91900000L);
		years.put(1131, 72300000L);
		years.put(1132, 79600000L);
		years.put(1133, 70200000L);
		years.put(1134, 69000000L);
		years.put(1135, 71100000L);
		years.put(1136, 70500000L);
		years.put(1137, 91500000L);
		years.put(1138, 64600000L);
		years.put(1139, 77600000L);
		years.put(1140, 93700000L);
		years.put(1141, 71300000L);
		years.put(1142, 93700000L);
		years.put(1143, 90300000L);
		years.put(1144, 74300000L);
		years.put(1145, 68500000L);
		years.put(1146, 72300000L);
		years.put(1147, 73400000L);
		years.put(1148, 75000000L);
		years.put(1149, 92000000L);
		years.put(1150, 199000000L);
		years.put(1151, 70300000L);
		years.put(1152, 82300000L);
		years.put(1153, 64800000L);
		years.put(1154, 92800000L);
		years.put(1155, 135000000L);
		years.put(1156, 98800000L);
		years.put(1157, 62200000L);
		years.put(1158, 86800000L);
		years.put(1159, 71800000L);
		years.put(1160, 86000000L);
		years.put(1161, 66200000L);
		years.put(1162, 62700000L);
		years.put(1163, 74800000L);
		years.put(1164, 63300000L);
		years.put(1165, 63500000L);
		years.put(1166, 64100000L);
		years.put(1167, 61700000L);
		years.put(1168, 62100000L);
		years.put(1169, 84400000L);
		years.put(1170, 118000000L);
		years.put(1171, 65200000L);
		years.put(1172, 84300000L);
		years.put(1173, 60000000L);
		years.put(1174, 85100000L);
		years.put(1175, 75800000L);
		years.put(1176, 95600000L);
		years.put(1177, 63400000L);
		years.put(1178, 71000000L);
		years.put(1179, 70000000L);
		years.put(1180, 132000000L);
		years.put(1181, 65800000L);
		years.put(1182, 94600000L);
		years.put(1183, 84700000L);
		years.put(1184, 63700000L);
		years.put(1185, 66700000L);
		years.put(1186, 59800000L);
		years.put(1187, 83900000L);
		years.put(1188, 107000000L);
		years.put(1189, 85400000L);
		years.put(1190, 117000000L);
		years.put(1191, 62100000L);
		years.put(1192, 60200000L);
		years.put(1193, 82900000L);
		years.put(1194, 61100000L);
		years.put(1195, 68400000L);
		years.put(1196, 84600000L);
		years.put(1197, 59700000L);
		years.put(1198, 74700000L);
		years.put(1199, 94900000L);
		years.put(1200, 1390000000L);
		years.put(1201, 108000000L);
		years.put(1202, 83200000L);
		years.put(1203, 77200000L);
		years.put(1204, 113000000L);
		years.put(1205, 115000000L);
		years.put(1206, 83600000L);
		years.put(1207, 110000000L);
		years.put(1208, 78500000L);
		years.put(1209, 75000000L);
		years.put(1210, 152000000L);
		years.put(1211, 82200000L);
		years.put(1212, 134000000L);
		years.put(1213, 72400000L);
		years.put(1214, 68100000L);
		years.put(1215, 110000000L);
		years.put(1216, 81700000L);
		years.put(1217, 76600000L);
		years.put(1218, 77400000L);
		years.put(1219, 66400000L);
		years.put(1220, 97100000L);
		years.put(1221, 104000000L);
		years.put(1222, 104000000L);
		years.put(1223, 75000000L);
		years.put(1224, 70100000L);
		years.put(1225, 74300000L);
		years.put(1226, 63400000L);
		years.put(1227, 89000000L);
		years.put(1228, 91300000L);
		years.put(1229, 73500000L);
		years.put(1230, 126000000L);
		years.put(1231, 94500000L);
		years.put(1232, 77100000L);
		years.put(1233, 63400000L);
		years.put(1234, 168000000L);
		years.put(1235, 92400000L);
		years.put(1236, 61800000L);
		years.put(1237, 67200000L);
		years.put(1238, 84900000L);
		years.put(1239, 60400000L);
		years.put(1240, 82100000L);
		years.put(1241, 62700000L);
		years.put(1242, 90100000L);
		years.put(1243, 81800000L);
		years.put(1244, 69300000L);
		years.put(1245, 90200000L);
		years.put(1246, 68700000L);
		years.put(1247, 79900000L);
		years.put(1248, 65400000L);
		years.put(1249, 84800000L);
		years.put(1250, 173000000L);
		years.put(1251, 68200000L);
		years.put(1252, 61900000L);
		years.put(1253, 80100000L);
		years.put(1254, 61900000L);
		years.put(1255, 63500000L);
		years.put(1256, 86400000L);
		years.put(1257, 66500000L);
		years.put(1258, 58100000L);
		years.put(1259, 57700000L);
		years.put(1260, 175000000L);
		years.put(1261, 60900000L);
		years.put(1262, 57900000L);
		years.put(1263, 79500000L);
		years.put(1264, 80600000L);
		years.put(1265, 60000000L);
		years.put(1266, 66600000L);
		years.put(1267, 65400000L);
		years.put(1268, 57100000L);
		years.put(1269, 58600000L);
		years.put(1270, 82600000L);
		years.put(1271, 80000000L);
		years.put(1272, 68800000L);
		years.put(1273, 55300000L);
		years.put(1274, 58600000L);
		years.put(1275, 91900000L);
		years.put(1276, 66400000L);
		years.put(1277, 55500000L);
		years.put(1278, 55900000L);
		years.put(1279, 58000000L);
		years.put(1280, 470000000L);
		years.put(1281, 68200000L);
		years.put(1282, 55800000L);
		years.put(1283, 76500000L);
		years.put(1284, 58000000L);
		years.put(1285, 59200000L);
		years.put(1286, 78600000L);
		years.put(1287, 55700000L);
		years.put(1288, 90000000L);
		years.put(1289, 55500000L);
		years.put(1290, 79400000L);
		years.put(1291, 80300000L);
		years.put(1292, 64400000L);
		years.put(1293, 75900000L);
		years.put(1294, 75800000L);
		years.put(1295, 59600000L);
		years.put(1296, 62800000L);
		years.put(1297, 53200000L);
		years.put(1298, 60500000L);
		years.put(1299, 103000000L);
		years.put(1300, 519000000L);
		years.put(1301, 93800000L);
		years.put(1302, 71600000L);
		years.put(1303, 104000000L);
		years.put(1304, 68900000L);
		years.put(1305, 102000000L);
		years.put(1306, 66900000L);
		years.put(1307, 97200000L);
		years.put(1308, 65500000L);
		years.put(1309, 65800000L);
		years.put(1310, 1050000000L);
		years.put(1311, 91000000L);
		years.put(1312, 63100000L);
		years.put(1313, 79400000L);
		years.put(1314, 103000000L);
		years.put(1315, 63900000L);
		years.put(1316, 82000000L);
		years.put(1317, 58500000L);
		years.put(1318, 81700000L);
		years.put(1319, 80100000L);
		years.put(1320, 137000000L);
		years.put(1321, 72600000L);
		years.put(1322, 66700000L);
		years.put(1323, 83500000L);
		years.put(1324, 68300000L);
		years.put(1325, 64600000L);
		years.put(1326, 80500000L);
		years.put(1327, 55000000L);
		years.put(1328, 79900000L);
		years.put(1329, 55400000L);
		years.put(1330, 77800000L);
		years.put(1331, 84500000L);
		years.put(1332, 58400000L);
		years.put(1333, 89100000L);
		years.put(1334, 55800000L);
		years.put(1335, 68200000L);
		years.put(1336, 81700000L);
		years.put(1337, 137000000L);
		years.put(1338, 69500000L);
		years.put(1339, 56400000L);
		years.put(1340, 104000000L);
		years.put(1341, 81700000L);
		years.put(1342, 79400000L);
		years.put(1343, 54400000L);
		years.put(1344, 94600000L);
		years.put(1345, 85500000L);
		years.put(1346, 57600000L);
		years.put(1347, 76100000L);
		years.put(1348, 55800000L);
		years.put(1349, 79500000L);
		years.put(1350, 131000000L);
		years.put(1351, 65600000L);
		years.put(1352, 56300000L);
		years.put(1353, 53700000L);
		years.put(1354, 54400000L);
		years.put(1355, 58400000L);
		years.put(1356, 68400000L);
		years.put(1357, 59700000L);
		years.put(1358, 76400000L);
		years.put(1359, 78200000L);
		years.put(1360, 119000000L);
		years.put(1361, 79000000L);
		years.put(1362, 75900000L);
		years.put(1363, 53700000L);
		years.put(1364, 55800000L);
		years.put(1365, 90900000L);
		years.put(1366, 87100000L);
		years.put(1367, 75900000L);
		years.put(1368, 64400000L);
		years.put(1369, 55200000L);
		years.put(1370, 66700000L);
		years.put(1371, 78000000L);
		years.put(1372, 54700000L);
		years.put(1373, 72400000L);
		years.put(1374, 60100000L);
		years.put(1375, 59600000L);
		years.put(1376, 64100000L);
		years.put(1377, 54600000L);
		years.put(1378, 65000000L);
		years.put(1379, 73500000L);
		years.put(1380, 124000000L);
		years.put(1381, 78700000L);
		years.put(1382, 54000000L);
		years.put(1383, 53100000L);
		years.put(1384, 55000000L);
		years.put(1385, 57900000L);
		years.put(1386, 84600000L);
		years.put(1387, 84600000L);
		years.put(1388, 96500000L);
		years.put(1389, 105000000L);
		years.put(1390, 154000000L);
		years.put(1391, 144000000L);
		years.put(1392, 184000000L);
		years.put(1393, 71600000L);
		years.put(1394, 92700000L);
		years.put(1395, 56700000L);
		years.put(1396, 52300000L);
		years.put(1397, 51700000L);
		years.put(1398, 54200000L);
		years.put(1399, 78000000L);
		years.put(1400, 365000000L);
		years.put(1401, 78700000L);
		years.put(1402, 84800000L);
		years.put(1403, 80500000L);
		years.put(1404, 89400000L);
		years.put(1405, 61500000L);
		years.put(1406, 66800000L);
		years.put(1407, 65800000L);
		years.put(1408, 86600000L);
		years.put(1409, 63700000L);
		years.put(1410, 109000000L);
		years.put(1411, 61100000L);
		years.put(1412, 57000000L);
		years.put(1413, 75700000L);
		years.put(1414, 90200000L);
		years.put(1415, 87900000L);
		years.put(1416, 56200000L);
		years.put(1417, 56900000L);
		years.put(1418, 65300000L);
		years.put(1419, 74900000L);
		years.put(1420, 111000000L);
		years.put(1421, 87700000L);
		years.put(1422, 71500000L);
		years.put(1423, 58900000L);
		years.put(1424, 64600000L);
		years.put(1425, 69600000L);
		years.put(1426, 83500000L);
		years.put(1427, 69000000L);
		years.put(1428, 74600000L);
		years.put(1429, 74900000L);
		years.put(1430, 96700000L);
		years.put(1431, 71300000L);
		years.put(1432, 138000000L);
		years.put(1433, 78200000L);
		years.put(1434, 155000000L);
		years.put(1435, 104000000L);
		years.put(1436, 57400000L);
		years.put(1437, 56600000L);
		years.put(1438, 65000000L);
		years.put(1439, 64000000L);
		years.put(1440, 140000000L);
		years.put(1441, 80000000L);
		years.put(1442, 50600000L);
		years.put(1443, 69600000L);
		years.put(1444, 62700000L);
		years.put(1445, 77300000L);
		years.put(1446, 49300000L);
		years.put(1447, 68400000L);
		years.put(1448, 50100000L);
		years.put(1449, 60700000L);
		years.put(1450, 107000000L);
		years.put(1451, 62000000L);
		years.put(1452, 61900000L);
		years.put(1453, 85300000L);
		years.put(1454, 58100000L);
		years.put(1455, 54400000L);
		years.put(1456, 63000000L);
		years.put(1457, 49100000L);
		years.put(1458, 70800000L);
		years.put(1459, 69300000L);
		years.put(1460, 97400000L);
		years.put(1461, 77500000L);
		years.put(1462, 56600000L);
		years.put(1463, 48800000L);
		years.put(1464, 50700000L);
		years.put(1465, 71600000L);
		years.put(1466, 50000000L);
		years.put(1467, 67300000L);
		years.put(1468, 49700000L);
		years.put(1469, 67600000L);
		years.put(1470, 117000000L);
		years.put(1471, 61200000L);
		years.put(1472, 51200000L);
		years.put(1473, 57600000L);
		years.put(1474, 67400000L);
		years.put(1475, 65000000L);
		years.put(1476, 50900000L);
		years.put(1477, 69000000L);
		years.put(1478, 62300000L);
		years.put(1479, 47800000L);
		years.put(1480, 116000000L);
		years.put(1481, 70900000L);
		years.put(1482, 56700000L);
		years.put(1483, 60200000L);
		years.put(1484, 51500000L);
		years.put(1485, 53700000L);
		years.put(1486, 48000000L);
		years.put(1487, 52800000L);
		years.put(1488, 76600000L);
		years.put(1489, 54900000L);
		years.put(1490, 82100000L);
		years.put(1491, 48600000L);
		years.put(1492, 76200000L);
		years.put(1493, 49700000L);
		years.put(1494, 58200000L);
		years.put(1495, 77000000L);
		years.put(1496, 71500000L);
		years.put(1497, 49200000L);
		years.put(1498, 58400000L);
		years.put(1499, 103000000L);
		years.put(1500, 1150000000L);
		years.put(1501, 112000000L);
		years.put(1502, 83000000L);
		years.put(1503, 76600000L);
		years.put(1504, 56900000L);
		years.put(1505, 59000000L);
		years.put(1506, 63400000L);
		years.put(1507, 53700000L);
		years.put(1508, 53300000L);
		years.put(1509, 53300000L);
		years.put(1510, 102000000L);
		years.put(1511, 56400000L);
		years.put(1512, 62500000L);
		years.put(1513, 74200000L);
		years.put(1514, 50700000L);
		years.put(1515, 75700000L);
		years.put(1516, 63600000L);
		years.put(1517, 59800000L);
		years.put(1518, 75800000L);
		years.put(1519, 74100000L);
		years.put(1520, 125000000L);
		years.put(1521, 57900000L);
		years.put(1522, 60900000L);
		years.put(1523, 70800000L);
		years.put(1524, 62600000L);
		years.put(1525, 89000000L);
		years.put(1526, 61900000L);
		years.put(1527, 69700000L);
		years.put(1528, 51900000L);
		years.put(1529, 49900000L);
		years.put(1530, 101000000L);
		years.put(1531, 71200000L);
		years.put(1532, 50500000L);
		years.put(1533, 59100000L);
		years.put(1534, 57700000L);
		years.put(1535, 88400000L);
		years.put(1536, 149000000L);
		years.put(1537, 69600000L);
		years.put(1538, 69700000L);
		years.put(1539, 68300000L);
		years.put(1540, 98300000L);
		years.put(1541, 52200000L);
		years.put(1542, 69900000L);
		years.put(1543, 56300000L);
		years.put(1544, 101000000L);
		years.put(1545, 81300000L);
		years.put(1546, 70000000L);
		years.put(1547, 56100000L);
		years.put(1548, 58400000L);
		years.put(1549, 50300000L);
		years.put(1550, 96500000L);
		years.put(1551, 60200000L);
		years.put(1552, 668000000L);
		years.put(1553, 48600000L);
		years.put(1554, 71300000L);
		years.put(1555, 63200000L);
		years.put(1556, 50200000L);
		years.put(1557, 55900000L);
		years.put(1558, 59200000L);
		years.put(1559, 71500000L);
		years.put(1560, 73900000L);
		years.put(1561, 70600000L);
		years.put(1562, 47100000L);
		years.put(1563, 55700000L);
		years.put(1564, 50600000L);
		years.put(1565, 74900000L);
		years.put(1566, 57300000L);
		years.put(1567, 47500000L);
		years.put(1568, 52100000L);
		years.put(1569, 67200000L);
		years.put(1570, 61000000L);
		years.put(1571, 76800000L);
		years.put(1572, 50800000L);
		years.put(1573, 67600000L);
		years.put(1574, 46400000L);
		years.put(1575, 103000000L);
		years.put(1576, 68300000L);
		years.put(1577, 74300000L);
		years.put(1578, 47000000L);
		years.put(1579, 55200000L);
		years.put(1580, 77900000L);
		years.put(1581, 57200000L);
		years.put(1582, 57000000L);
		years.put(1583, 46400000L);
		years.put(1584, 72600000L);
		years.put(1585, 50000000L);
		years.put(1586, 64200000L);
		years.put(1587, 56400000L);
		years.put(1588, 72200000L);
		years.put(1589, 46100000L);
		years.put(1590, 66000000L);
		years.put(1591, 68700000L);
		years.put(1592, 48100000L);
		years.put(1593, 45800000L);
		years.put(1594, 611000000L);
		years.put(1595, 51700000L);
		years.put(1596, 50800000L);
		years.put(1597, 53300000L);
		years.put(1598, 64800000L);
		years.put(1599, 93500000L);
		years.put(1600, 1920000000L);
		years.put(1601, 85100000L);
		years.put(1602, 80300000L);
		years.put(1603, 54500000L);
		years.put(1604, 63600000L);
		years.put(1605, 68200000L);
		years.put(1606, 77700000L);
		years.put(1607, 67200000L);
		years.put(1608, 55700000L);
		years.put(1609, 74200000L);
		years.put(1610, 68400000L);
		years.put(1611, 81500000L);
		years.put(1612, 53000000L);
		years.put(1613, 57200000L);
		years.put(1614, 70800000L);
		years.put(1615, 54600000L);
		years.put(1616, 62700000L);
		years.put(1617, 50800000L);
		years.put(1618, 51500000L);
		years.put(1619, 48900000L);
		years.put(1620, 90600000L);
		years.put(1621, 53800000L);
		years.put(1622, 69000000L);
		years.put(1623, 48800000L);
		years.put(1624, 50700000L);
		years.put(1625, 65200000L);
		years.put(1626, 50000000L);
		years.put(1627, 53500000L);
		years.put(1628, 70400000L);
		years.put(1629, 64400000L);
		years.put(1630, 90600000L);
		years.put(1631, 49100000L);
		years.put(1632, 85200000L);
		years.put(1633, 51200000L);
		years.put(1634, 47600000L);
		years.put(1635, 51500000L);
		years.put(1636, 57400000L);
		years.put(1637, 47800000L);
		years.put(1638, 59000000L);
		years.put(1639, 64700000L);
		years.put(1640, 98900000L);
		years.put(1641, 59300000L);
		years.put(1642, 56300000L);
		years.put(1643, 46000000L);
		years.put(1644, 59700000L);
		years.put(1645, 49900000L);
		years.put(1646, 45600000L);
		years.put(1647, 52900000L);
		years.put(1648, 69300000L);
		years.put(1649, 48700000L);
		years.put(1650, 122000000L);
		years.put(1651, 72000000L);
		years.put(1652, 46600000L);
		years.put(1653, 48300000L);
		years.put(1654, 47800000L);
		years.put(1655, 49700000L);
		years.put(1656, 68100000L);
		years.put(1657, 44500000L);
		years.put(1658, 45800000L);
		years.put(1659, 54100000L);
		years.put(1660, 64600000L);
		years.put(1661, 64900000L);
		years.put(1662, 54700000L);
		years.put(1663, 46200000L);
		years.put(1664, 73300000L);
		years.put(1665, 52100000L);
		years.put(1666, 74600000L);
		years.put(1667, 69300000L);
		years.put(1668, 46200000L);
		years.put(1669, 602000000L);
		years.put(1670, 57200000L);
		years.put(1671, 48400000L);
		years.put(1672, 49100000L);
		years.put(1673, 63900000L);
		years.put(1674, 47300000L);
		years.put(1675, 59900000L);
		years.put(1676, 49900000L);
		years.put(1677, 52400000L);
		years.put(1678, 66700000L);
		years.put(1679, 61800000L);
		years.put(1680, 173000000L);
		years.put(1681, 72400000L);
		years.put(1682, 52400000L);
		years.put(1683, 47800000L);
		years.put(1684, 47500000L);
		years.put(1685, 50800000L);
		years.put(1686, 46300000L);
		years.put(1687, 52000000L);
		years.put(1688, 189000000L);
		years.put(1689, 46600000L);
		years.put(1690, 74800000L);
		years.put(1691, 53900000L);
		years.put(1692, 65600000L);
		years.put(1693, 60600000L);
		years.put(1694, 63200000L);
		years.put(1695, 58000000L);
		years.put(1696, 49200000L);
		years.put(1697, 51300000L);
		years.put(1698, 68900000L);
		years.put(1699, 58100000L);
		years.put(1700, 349000000L);
		years.put(1701, 72600000L);
		years.put(1702, 75600000L);
		years.put(1703, 53100000L);
		years.put(1704, 94400000L);
		years.put(1705, 61600000L);
		years.put(1706, 60500000L);
		years.put(1707, 58500000L);
		years.put(1708, 57400000L);
		years.put(1709, 50700000L);
		years.put(1710, 89700000L);
		years.put(1711, 53800000L);
		years.put(1712, 63800000L);
		years.put(1713, 69700000L);
		years.put(1714, 49900000L);
		years.put(1715, 75400000L);
		years.put(1716, 71300000L);
		years.put(1717, 54900000L);
		years.put(1718, 70500000L);
		years.put(1719, 57700000L);
		years.put(1720, 95800000L);
		years.put(1721, 60900000L);
		years.put(1722, 60700000L);
		years.put(1723, 67200000L);
		years.put(1724, 56300000L);
		years.put(1725, 57600000L);
		years.put(1726, 68200000L);
		years.put(1727, 78500000L);
		years.put(1728, 60500000L);
		years.put(1729, 65700000L);
		years.put(1730, 89400000L);
		years.put(1731, 68100000L);
		years.put(1732, 51300000L);
		years.put(1733, 48800000L);
		years.put(1734, 49500000L);
		years.put(1735, 50400000L);
		years.put(1736, 48000000L);
		years.put(1737, 65800000L);
		years.put(1738, 55000000L);
		years.put(1739, 54700000L);
		years.put(1740, 91300000L);
		years.put(1741, 70600000L);
		years.put(1742, 56400000L);
		years.put(1743, 65600000L);
		years.put(1744, 55700000L);
		years.put(1745, 50800000L);
		years.put(1746, 47500000L);
		years.put(1747, 67800000L);
		years.put(1748, 47400000L);
		years.put(1749, 48600000L);
		years.put(1750, 162000000L);
		years.put(1751, 51900000L);
		years.put(1752, 56900000L);
		years.put(1753, 47400000L);
		years.put(1754, 54700000L);
		years.put(1755, 66800000L);
		years.put(1756, 56300000L);
		years.put(1757, 65600000L);
		years.put(1758, 58300000L);
		years.put(1759, 67100000L);
		years.put(1760, 94900000L);
		years.put(1761, 50600000L);
		years.put(1762, 67100000L);
		years.put(1763, 55500000L);
		years.put(1764, 51000000L);
		years.put(1765, 70100000L);
		years.put(1766, 57600000L);
		years.put(1767, 67500000L);
		years.put(1768, 48600000L);
		years.put(1769, 48000000L);
		years.put(1770, 92000000L);
		years.put(1771, 71100000L);
		years.put(1772, 50100000L);
		years.put(1773, 47900000L);
		years.put(1774, 49300000L);
		years.put(1775, 73300000L);
		years.put(1776, 84100000L);
		years.put(1777, 75200000L);
		years.put(1778, 56400000L);
		years.put(1779, 54900000L);
		years.put(1780, 107000000L);
		years.put(1781, 72600000L);
		years.put(1782, 51000000L);
		years.put(1783, 73500000L);
		years.put(1784, 72900000L);
		years.put(1785, 60500000L);
		years.put(1786, 57200000L);
		years.put(1787, 51700000L);
		years.put(1788, 64800000L);
		years.put(1789, 84200000L);
		years.put(1790, 105000000L);
		years.put(1791, 62100000L);
		years.put(1792, 55300000L);
		years.put(1793, 60200000L);
		years.put(1794, 61000000L);
		years.put(1795, 58000000L);
		years.put(1796, 56300000L);
		years.put(1797, 72200000L);
		years.put(1798, 55900000L);
		years.put(1799, 797000000L);
		years.put(1800, 672000000L);
		years.put(1801, 81500000L);
		years.put(1802, 85900000L);
		years.put(1803, 84600000L);
		years.put(1804, 86200000L);
		years.put(1805, 734000000L);
		years.put(1806, 84800000L);
		years.put(1807, 77500000L);
		years.put(1808, 59700000L);
		years.put(1809, 68900000L);
		years.put(1810, 72000000L);
		years.put(1811, 98000000L);
		years.put(1812, 86400000L);
		years.put(1813, 83400000L);
		years.put(1814, 59500000L);
		years.put(1815, 96000000L);
		years.put(1816, 66700000L);
		years.put(1817, 70300000L);
		years.put(1818, 99200000L);
		years.put(1819, 84300000L);
		years.put(1820, 88000000L);
		years.put(1821, 108000000L);
		years.put(1822, 88600000L);
		years.put(1823, 65200000L);
		years.put(1824, 63600000L);
		years.put(1825, 65400000L);
		years.put(1826, 82900000L);
		years.put(1827, 67700000L);
		years.put(1828, 71700000L);
		years.put(1829, 58700000L);
		years.put(1830, 121000000L);
		years.put(1831, 69700000L);
		years.put(1832, 91000000L);
		years.put(1833, 63900000L);
		years.put(1834, 88300000L);
		years.put(1835, 91800000L);
		years.put(1836, 91400000L);
		years.put(1837, 90100000L);
		years.put(1838, 85400000L);
		years.put(1839, 61400000L);
		years.put(1840, 105000000L);
		years.put(1841, 93300000L);
		years.put(1842, 66700000L);
		years.put(1843, 87900000L);
		years.put(1844, 91500000L);
		years.put(1845, 93800000L);
		years.put(1846, 754000000L);
		years.put(1847, 61300000L);
		years.put(1848, 112000000L);
		years.put(1849, 95600000L);
		years.put(1850, 183000000L);
		years.put(1851, 105000000L);
		years.put(1852, 76000000L);
		years.put(1853, 65000000L);
		years.put(1854, 97100000L);
		years.put(1855, 82200000L);
		years.put(1856, 83300000L);
		years.put(1857, 96400000L);
		years.put(1858, 82300000L);
		years.put(1859, 103000000L);
		years.put(1860, 119000000L);
		years.put(1861, 127000000L);
		years.put(1862, 87400000L);
		years.put(1863, 88600000L);
		years.put(1864, 112000000L);
		years.put(1865, 81600000L);
		years.put(1866, 84200000L);
		years.put(1867, 73200000L);
		years.put(1868, 85000000L);
		years.put(1869, 73100000L);
		years.put(1870, 1110000000L);
		years.put(1871, 116000000L);
		years.put(1872, 83000000L);
		years.put(1873, 76900000L);
		years.put(1874, 111000000L);
		years.put(1875, 87200000L);
		years.put(1876, 93400000L);
		years.put(1877, 96800000L);
		years.put(1878, 77600000L);
		years.put(1879, 76900000L);
		years.put(1880, 190000000L);
		years.put(1881, 133000000L);
		years.put(1882, 116000000L);
		years.put(1883, 117000000L);
		years.put(1884, 81400000L);
		years.put(1885, 110000000L);
		years.put(1886, 85500000L);
		years.put(1887, 94500000L);
		years.put(1888, 143000000L);
		years.put(1889, 137000000L);
		years.put(1890, 238000000L);
		years.put(1891, 130000000L);
		years.put(1892, 126000000L);
		years.put(1893, 105000000L);
		years.put(1894, 89900000L);
		years.put(1895, 142000000L);
		years.put(1896, 118000000L);
		years.put(1897, 116000000L);
		years.put(1898, 148000000L);
		years.put(1899, 141000000L);
		years.put(1900, 381000000L);
		years.put(1901, 179000000L);
		years.put(1902, 176000000L);
		years.put(1903, 197000000L);
		years.put(1904, 130000000L);
		years.put(1905, 217000000L);
		years.put(1906, 137000000L);
		years.put(1907, 192000000L);
		years.put(1908, 145000000L);
		years.put(1909, 190000000L);
		years.put(1910, 195000000L);
		years.put(1911, 234000000L);
		years.put(1912, 167000000L);
		years.put(1913, 213000000L);
		years.put(1914, 172000000L);
		years.put(1915, 218000000L);
		years.put(1916, 174000000L);
		years.put(1917, 186000000L);
		years.put(1918, 180000000L);
		years.put(1919, 235000000L);
		years.put(1920, 937000000L);
		years.put(1921, 411000000L);
		years.put(1922, 512000000L);
		years.put(1923, 687000000L);
		years.put(1924, 413000000L);
		years.put(1925, 688000000L);
		years.put(1926, 687000000L);
		years.put(1927, 694000000L);
		years.put(1928, 524000000L);
		years.put(1929, 695000000L);
		years.put(1930, 633000000L);
		years.put(1931, 423000000L);
		years.put(1932, 2410000000L);
		years.put(1933, 711000000L);
		years.put(1934, 429000000L);
		years.put(1935, 554000000L);
		years.put(1936, 449000000L);
		years.put(1937, 710000000L);
		years.put(1938, 547000000L);
		years.put(1939, 462000000L);
		years.put(1940, 761000000L);
		years.put(1941, 560000000L);
		years.put(1942, 562000000L);
		years.put(1943, 710000000L);
		years.put(1944, 807000000L);
		years.put(1945, 846000000L);
		years.put(1946, 744000000L);
		years.put(1947, 460000000L);
		years.put(1948, 483000000L);
		years.put(1949, 487000000L);
		years.put(1950, 951000000L);
		years.put(1951, 471000000L);
		years.put(1952, 770000000L);
		years.put(1953, 776000000L);
		years.put(1954, 613000000L);
		years.put(1955, 502000000L);
		years.put(1956, 505000000L);
		years.put(1957, 502000000L);
		years.put(1958, 509000000L);
		years.put(1959, 633000000L);
		years.put(1960, 981000000L);
		years.put(1961, 846000000L);
		years.put(1962, 535000000L);
		years.put(1963, 658000000L);
		years.put(1964, 878000000L);
		years.put(1965, 904000000L);
		years.put(1966, 889000000L);
		years.put(1967, 904000000L);
		years.put(1968, 938000000L);
		years.put(1969, 959000000L);
		years.put(1970, 1160000000L);
		years.put(1971, 957000000L);
		years.put(1972, 4380000000L);
		years.put(1973, 995000000L);
		years.put(1974, 983000000L);
		years.put(1975, 1020000000L);
		years.put(1976, 1040000000L);
		years.put(1977, 1010000000L);
		years.put(1978, 815000000L);
		years.put(1979, 1080000000L);
		years.put(1980, 1340000000L);
		years.put(1981, 1090000000L);
		years.put(1982, 869000000L);
		years.put(1983, 881000000L);
		years.put(1984, 1180000000L);
		years.put(1985, 1220000000L);
		years.put(1986, 1230000000L);
		years.put(1987, 1240000000L);
		years.put(1988, 1300000000L);
		years.put(1989, 884000000L);
		years.put(1990, 1570000000L);
		years.put(1991, 1420000000L);
		years.put(1992, 976000000L);
		years.put(1993, 1500000000L);
		years.put(1994, 1620000000L);
		years.put(1995, 1790000000L);
		years.put(1996, 1890000000L);
		years.put(1997, 2020000000L);
		years.put(1998, 2060000000L);
		years.put(1999, 2570000000L);
		years.put(2000, 5160000000L);
		years.put(2001, 2470000000L);
		years.put(2002, 3180000000L);
		years.put(2003, 3620000000L);
		years.put(2004, 4240000000L);
		years.put(2005, 3670000000L);
		years.put(2006, 6390000000L);
		years.put(2007, 8020000000L);
		years.put(2008, 9800000000L);
		years.put(2009, 11620000000L);
		years.put(2010, 14320000000L);
		years.put(2011, 13440000000L);
		years.put(2012, 22010000000L);
		years.put(2013, 25270000000L);
		
		for ( Map.Entry<Integer, Long> entry : years.entrySet()) sum += entry.getValue();
		average = sum / (double) years.size();
		
		System.out.println("Sum: " + sum);
		System.out.println("Avg: " + average);
	}
}

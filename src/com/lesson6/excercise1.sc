package com.lesson6

object excercise1 {
  val zones = java.util.TimeZone.getAvailableIDs  //> zones  : Array[String] = Array(Africa/Abidjan, Africa/Accra, Africa/Addis_Aba
                                                  //| ba, Africa/Algiers, Africa/Asmara, Africa/Asmera, Africa/Bamako, Africa/Bangu
                                                  //| i, Africa/Banjul, Africa/Bissau, Africa/Blantyre, Africa/Brazzaville, Africa/
                                                  //| Bujumbura, Africa/Cairo, Africa/Casablanca, Africa/Ceuta, Africa/Conakry, Afr
                                                  //| ica/Dakar, Africa/Dar_es_Salaam, Africa/Djibouti, Africa/Douala, Africa/El_Aa
                                                  //| iun, Africa/Freetown, Africa/Gaborone, Africa/Harare, Africa/Johannesburg, Af
                                                  //| rica/Juba, Africa/Kampala, Africa/Khartoum, Africa/Kigali, Africa/Kinshasa, A
                                                  //| frica/Lagos, Africa/Libreville, Africa/Lome, Africa/Luanda, Africa/Lubumbashi
                                                  //| , Africa/Lusaka, Africa/Malabo, Africa/Maputo, Africa/Maseru, Africa/Mbabane,
                                                  //|  Africa/Mogadishu, Africa/Monrovia, Africa/Nairobi, Africa/Ndjamena, Africa/N
                                                  //| iamey, Africa/Nouakchott, Africa/Ouagadougou, Africa/Porto-Novo, Africa/Sao_T
                                                  //| ome, Africa/Timbuktu, Africa/Tripoli, Africa/Tunis, Africa/Windhoek, America/
                                                  //| Adak, America/Anchorage, 
                                                  //| Output exceeds cutoff limit.
                                                  
 val splittedZones = zones.map(_.split("/")).filter(_.length>1).map(_(1)).grouped(10).toArray.map(_(0))
                                                  //> splittedZones  : Array[String] = Array(Abidjan, Blantyre, Douala, Kinshasa, 
                                                  //| Mbabane, Timbuktu, Argentina, Argentina, Belize, Catamarca, Curacao, Ensenad
                                                  //| a, Guatemala, Indiana, Kentucky, Managua, Mexico_City, Nome, Port-au-Prince,
                                                  //|  Rio_Branco, St_Barthelemy, Tijuana, Davis, Vostok, Baghdad, Choibalsan, Gaz
                                                  //| a, Jerusalem, Kuala_Lumpur, Novokuznetsk, Riyadh, Tbilisi, Urumqi, Cape_Verd
                                                  //| e, Adelaide, Lord_Howe, West, Mountain, GMT+10, GMT+9, GMT-4, Universal, Bru
                                                  //| ssels, Isle_of_Man, Madrid, Prague, Tallinn, Warsaw, Mahe, Bougainville, Gam
                                                  //| bier, Midway, Port_Moresby, Yap, PST8, Hawaii)
                                                  
                                                  





}
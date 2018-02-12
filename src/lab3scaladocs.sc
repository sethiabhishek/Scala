object lab3scaladocs {
  
  
  val result = "Mississippi" distinct             //> result  : String = Misp
  
  val perm = "Mississippi" permutations           //> perm  : Iterator[String] = non-empty iterator
  
  perm toArray                                    //> res0: Array[String] = Array(Miiiisssspp, Miiiissspsp, Miiiissspps, Miiiissps
                                                  //| sp, Miiiisspsps, Miiiissppss, Miiiispsssp, Miiiispssps, Miiiispspss, Miiiisp
                                                  //| psss, Miiiipssssp, Miiiipsssps, Miiiipsspss, Miiiipspsss, Miiiippssss, Miiis
                                                  //| issspp, Miiisisspsp, Miiisisspps, Miiisispssp, Miiisispsps, Miiisisppss, Mii
                                                  //| isipsssp, Miiisipssps, Miiisipspss, Miiisippsss, Miiississpp, Miiissispsp, M
                                                  //| iiissispps, Miiissipssp, Miiissipsps, Miiissippss, Miiisssispp, Miiisssipsp,
                                                  //|  Miiisssipps, Miiissssipp, Miiisssspip, Miiissssppi, Miiissspisp, Miiissspip
                                                  //| s, Miiissspsip, Miiissspspi, Miiisssppis, Miiisssppsi, Miiisspissp, Miiisspi
                                                  //| sps, Miiisspipss, Miiisspsisp, Miiisspsips, Miiisspssip, Miiisspsspi, Miiiss
                                                  //| pspis, Miiisspspsi, Miiissppiss, Miiissppsis, Miiissppssi, Miiispisssp, Miii
                                                  //| spissps, Miiispispss, Miiispipsss, Miiispsissp, Miiispsisps, Miiispsipss, Mi
                                                  //| iispssisp, Miiispssips, Miiispsssip, Miiispssspi, Miiispsspis, Miiispsspsi, 
                                                  //| Miiispspiss, Miiispspsis
                                                  //| Output exceeds cutoff limit.
                                               
  "result" sum                                    //> res1: Char = ÊŸ
}
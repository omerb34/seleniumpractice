# Amazon sayfasında sql,samsung ve nokia aratıp sayfa başlıklarını her arama için test ediniz
#Aranacak kelimeleri config.properties dosyasından alınız

  Feature: Amazon kelime arama
    @gp07
    Scenario: T01 Amazonda sql samsung ve nokia araması
      Given kullanici "amazonUrl" gider
      Then kullanici sql samsung ve nokia aramasi yapar basliklari test eder
      And sayfayi kapatir
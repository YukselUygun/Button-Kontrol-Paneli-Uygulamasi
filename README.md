# Button-Kontrol-Paneli-Uygulamasi
## Programın Amacı:
Java Swing kütüphanesini kullanarak bir grafik kullanıcı arayüzü oluşturmak ve üzerindeki butonlara tıkladığımızda aktiflik ve pasiflik durumuna göre işlem yapmamızı sağlayan bir programdır.
## Programın Özellikleri ve Kullanımı:
Öncelikle bu uygulamada *Java Swing*, *awt*, *java.awt.event*, *javax.swing.JFrame*, *javax.swing.JPanel*, *javax.swing.JButton*, *java.awt.Color*, *java.awt.event.ActionEvent*, *java.awt.event.ActionListener*, kütüphane ve kütüphane yapılarını kullandık.
<br>Bu uygulamada 16 tane buton 4x4 lük sistemde tasarlanmıştır. Her butonun kendine ait bir GraphQL şema adresi bulunmaktadır. 
Bu uygulamamızda kontrol ettiğimiz iki tane aksiyon vardır bunlar: Aktiflik ve pasiflik tir. Aktiflik özelliğini kullandığımızda butonda aktif renk ve aktif simge özellikleri yer alır.
Uygulamada ki aktif rengimiz kırmızıdır ve aktif simge de butonların üzerinde yer alan "Aktif Buton" simgesidir. Pasiflik özelliğini kullandığımızda butonda pasif renk ve pasif simge özellikleri yer alır.
Uygulamada ki pasif rengimiz gridir ve pasif simge de butonların üzerinde yer alan "Pasif Buton" simgesidir.</br>
<br>**Uygulamamızın kullanımı ise şu şekildedir:**  İlk başta karşımıza gelen tüm butonlar pasif haldedir yani renkleri gridir ve üzerlerinde "Pasif Buton" yer alır. Ardından bastığımız herhangi bir buton  
aktif olur ve rengi kırmızı ve üzerinde "Aktif Buton" yazar. Birden fazla butonu aktif hale getirebiliriz ve bastığımız herhangi pasif buton aktif butona dönüşür.
Sonra aktif butonlar arasında herhamgi bir butona bastığımızda kendisi hariç diğer butonlar pasif buton olur ve renkleri griye döner üzerlerinde ise "Pasif Buton" yazar.
Her aktif buton oluştuğunda bir mutation çalıştıracaktır ve her butonun bir GraphQL adresi yazdırılacaktır.</br>
## GraphQL Nedir? ve Nerelerde Kullanılır?
<br>GraphQL, verileri istemeyi açıklayan ve genelde sunucudaki verileri bir istemciye yüklemek için kullanılan bir yapıdır.  Facebook tarafından geliştirilmiştir. Etkili, esnek ve verimli bir alternatif sunan yeni bir API standartıdır.
Özellikle web API'leri için kullanılan bir Açık kaynaklı olarak geliştirilmiş bir sorgu dilidir bu yüzden bir çok şirket bu yapıyı kullanmaktadır. GraphQL, REST API'lerin halefi olarak görülen, API'ler için modern bir sorgu dili ve çalışma zamanıdır.
GraphQL, eksik veya fazla veri getirilmeden "tam olarak istediğinizi alın" konsepti üzerine inşa edilmiştir. GraphQL, birden çok kaynaktan veri toplamayı kolaylaştırır ve verileri tanımlamak için birden çok uç nokta yerine bir tür sistemi kullanır.
Mobil kullanımın oranı GraphQL, ağ üzerinden aktarılması gereken verileri en aza indirerek uygulamaların düşük koşullardaki performansını iyileştirir.
Ön uç çerçevelerinin ve platformların çeşitliliği sürdürülebilir bir API oluşturma durumunu zorlaştırır.İşte tam da bu noktada, GraphQL ile istemci, ihtiyacı olan verilere erişebilir.
GraphQL, API'nizdeki verilerin eksiksiz ve anlaşılır bir tanımını sağlar, müşterilere tam olarak neye ihtiyaç duyduklarını sorma gücü verir, daha fazlasını değil, API'lerin zaman içinde geliştirilmesini kolaylaştırır ve güçlü geliştirici araçlarına olanak tanır.</br>
<br>GraphQL, verilerdeki değişiklikleri okumayı, yazmayı (değiştirmeyi) ve bunlara abone olmayı (gerçek zamanlı güncellemeler - en yaygın olarak WebHooks kullanılarak uygulanır) destekler. 
GraphQL sunucuları, Haskell, JavaScript, Perl, Python, Ruby, Java, C++, C#, Scala, Go, Erlang, PHP ve R dahil olmak üzere birden fazla dilde mevcuttur. GraphQL'in çekiciliği öncelikle ihtiyacınız olanı isteme ve tam da bunu alma kavramına dayanmaktadır; ne daha fazlası ne daha azı. 
GraphQL, API'nize sorgu gönderirken fazla veya eksik getirme olmadan son derece öngörülebilir bir sonuç döndürür ve GraphQL kullanan uygulamaların hızlı, kararlı ve ölçeklenebilir olmasını sağlar.#
GraphQL, geri dönen JSON yanıtında geri gelen ve daha sonra ayrıştırılması ve dağıtılması gereken tüm veri bloğunu belirleyen, genellikle belirli bir uç noktaya veya vurduğunuz kaynağa sahip olduğunuz standart REST API'sinden çok farklıdır.
GraphQL bunun yerine şema, sorgular ve çözümleyiciler etrafında oluşturulmuştur ve yalnızca bloğun tamamını değil, belirli bir veri parçasını istemenize izin vererek REST felsefesini geliştirmeyi amaçlamaktadır. 
Uzun bir veri akışını ayrıştırmanıza gerek yok; yalnızca istediğinizi alırsınız. İstediğiniz şey birkaç farklı REST API'sinden derlenebilir ancak GraphQL ve REST'in iki farklı şey olduğunu hatırlayalım: GraphQL bir dil ve teknolojidir, REST ise bir mimari modelidir; bu, ekipler GraphQL'i giderek daha fazla benimsese bile, bunun REST için yolun sonu anlamına gelmediği anlamına gelir.
Aslında REST ile ilgili herhangi bir sorunla karşılaşmadıysanız GraphQL'in size hiçbir faydası olmayabilir. Bu şekilde GraphQL, genellikle karmaşık bir UI/UX'e sahip ve genellikle birden fazla uç nokta gerektiren uygulamalarda ortaya çıkan geleneksel REST API'leriyle sınırlı olan ekipler için değerli olmuştur.
GraphQL tamamen verilerinizi bir grafik olarak görmek ve ardından bu grafiği sorgulamakla ilgilidir. Kullanılabilir hale getirdiğiniz verilerin şemasını tam olarak tanımlamanıza olanak tanır, ardından size gezinmeniz, geçiş yapmanız ve ihtiyacınız olanı keşfetmeniz için güçlü bir sorgu arayüzü sunar. 
GraphQL, kullanıma sunduğunuz nesnelerin her biri hakkında derinlemesine düşünmeniz için size güçlü bir çerçeve sunar, ardından bu veri nesneleri arasındaki ilişkilerin yanı sıra her nesnenin ek yinelemelerini veya varyanslarını tanımlamanıza yardımcı olur. 
Verileri ve bunların birbiriyle nasıl bağlantılı olduğunu daha iyi yönetebilir, aynı zamanda bu verilerde zaman içinde meydana gelen değişikliklerle başa çıkma konusunda yardım alabilirsiniz. GraphQL, yalnızca bir veritabanı veya bir dizi veri kaynağı olmanın ötesine geçer ve bunların tümüne, nasıl bağlantılı olduğuna bağlı olarak sorgulanabilen ve üzerinden geçilebilen tek bir varlık olarak bakmanıza olanak tanır. <br>
## Uygulama Çalıştırılması ve Test Süreci:
1)Butonların basılmamış ilk hali: <br>
![image](https://github.com/ahmetcaliskan63/Button-Kontrol-Paneli-Uygulamasi/assets/127660777/df9fa42d-9a67-45ce-9816-7a606e30face) <br><br><br>
2)Sadece bir butonun aktif edildiği durum: <br>
![image](https://github.com/ahmetcaliskan63/Button-Kontrol-Paneli-Uygulamasi/assets/127660777/365d0897-63bd-4dcb-a6d6-0702d4bd471a) <br><br><br>
3)Birden fazla butonun aktif edildiği durum: <br>
![image](https://github.com/ahmetcaliskan63/Button-Kontrol-Paneli-Uygulamasi/assets/127660777/f2be4487-ff6e-43b3-ac14-0a3158bbb811) <br><br><br>
4)Herhangi bir aktif butona basılarak kendisi hariç diğer aktif butonların pasif olduğu durum: <br>
![image](https://github.com/ahmetcaliskan63/Button-Kontrol-Paneli-Uygulamasi/assets/127660777/5702bf93-337a-4daf-819b-5aab477928a0) <br><br><br>
5)En son aktif kalan butonun pasif hale getirilme durumu: <br>
![image](https://github.com/ahmetcaliskan63/Button-Kontrol-Paneli-Uygulamasi/assets/127660777/df9fa42d-9a67-45ce-9816-7a606e30face) <br><br><br>
6)Her aktifleştirdiğimiz butonun GraphQL adresi: <br>
![image](https://github.com/ahmetcaliskan63/Button-Kontrol-Paneli-Uygulamasi/assets/127660777/63824048-5d43-44a4-a35e-19ff011cc9bb) 




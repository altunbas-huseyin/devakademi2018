**Apache Ignite örneği çalıştırabilmek için önce yüklemeniz gerekiyor (2.5.0 versiyonu yükleyin) nasıl yükleneceği hakkında bilgi edinmek için [buraya](https://github.com/mehmetozanguven/ApacheIgniteMyDocumentation/blob/master/MehmetOzanGuven_InternshipReport.md) bakabilirsiniz**

**JSON dosyasını okuduğum dosya yolu ve Apache Ignite için gereki olan .xml dosyasını eğer kendi bilgisayarınızda çalıştıracak iseniz, dosya yolunu değiştirmeniz gerekecek.**

Bu projede ki amacım :
1. Reklama tıklamış olan kullanıcıları toplayıp onları kategorilerine göre ayırmaktı. Böylece hangi özelliklere sahip kullanıcılar hangi reklamlara tıkladıkları anlayabilecek ve ileride kayıt olacak aynı özelliklere sahip kullanıcılarada bu reklamları gösterebilecektim. Ve böylece reklam kazancını arttıracaktım. **Şu anda sadece emlak kategorisi bulunmaktadır**
2. Projedeki veriler çok büyük olduğu için, bu verileri diskten okumak zaman alacaktı. Bende bu yüzden bunları hafızadan okuyabileceğimiz bir teknoloji olan Apache Ignite teknolojisini kullandım. **(Apache Ignite bir Memory Computing platform'u)** Böylece bir kere verileri hafızaya yükledikten sonra bütün işlemleri hafızada yapabiliyor olacağım(CRUD işlemleri). Bu da bana verileri daha hızlı okuyup işlem yapmamı sağlayacak.
  - **(Bunu com.DevAkademi.MemoryComputing paketinde bulabilirsiniz.) (Zamanım sınırlı olduğu için şu anda sadece bütün verileri hafızaya koyabildim. Onlar üzerinde işlem yapmadım.)**



Örnekte **com.DevAkademi.UserStatistic.UserStatisticApplication** :
1. emlak kategorisindeki reklamlara en çok tıklamış 10 kişiyi buldum. Sayıyı değiştirebilirsiniz.
2. Daha sonra bu 10 kişiden yüzde kaçının erkek ve kadın olduğunu buldum.
3. Daha sonra bu 10 kişinin yüzde kacının üniversite okuduğunu, lise okuduğunu vb.. sonuçları buldum.
4. Bir sonraki örnekte ise Bekar olan kullanıcıları buldum(ilk 30 kullanıcı).
5. Daha sonraki bu bekar kullanıcılarından hangi ilk 5'in en çok emlak kategorisine tıkladığını buldum.
6. Daha sonra bu 5 kişiden yüzde kaçının erkek ve kadın olduğunu buldum.


**Not projede 2 tane main sınıfı bulunmaktadır. Biri ApacheIgnite için diğeri ise örnek için**

# Spring Inversion of Control (IoC)

Spring Framework daha etkin ve hızlı uygulamalar geliştirmek için Java tabanlı bir çatıdır. Spring'i spring yapan en önemli özelliği ise IoC (Inversion of Control) için DI (Dependency Injection) kullanıyor olmasıdır. IoC uygulamamızın esnekliğini sağlayan bir örüntüdür. Loosely coupled bir mimari oluşturmamızı sağlayan prensip te diyebiliriz. Yani kodumuzu belirli katman/modül/bileşen(ler)'e ayırıp bunların değişikliklerinden ya da kullanımları arası geçişlerinden en az kod değişikliği ile bize maliyet yaratmayan kurgudur IoC. Başlıca avantajları şunlardır :

1. Kodumuzun modüler olmasını sağlar
2. Kod içinde katman/modül/bileşen değişikliklerinin kolaylıkla yapılmasını sağlar
3. Bir işin ya da eylemin, o işin uygulamasından ayrılmasını sağlar. (Uygulama değişse bile o işin tanımı değişmeyerek, o işi tetikleyen parçanın etkilenmemesi sağlanır.)
4. Mock sınıfları oluşturarak test süreçlerinin bileşen bazında ayrı yapılmasını sağlar

IoC farklı yöntemlerle sağlanabilir : Dependency Injection (DI), Strategy Pattern, Service Locator Pattern ve Factory Pattern. DI IoC'ye göre daha dar bir kapsamdadır, IoC'yi sağlayan örüntülerden biridir. 

# Spring Dependency Injection

Spring Framework ile modülerliği sağlamamızla beraber bileşenler arası bağımlılıkları zayıflatırız. Katmanlar arası bağımlılık ise dışarıdan gerekli katman diğer katmana dahil edilerek çözülür. Buna Dependency Injection denir.

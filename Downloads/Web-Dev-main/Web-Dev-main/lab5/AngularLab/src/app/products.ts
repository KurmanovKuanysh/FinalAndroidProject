export interface Product {
  id: number;
  name: string;
  price: number;
  description: string;
  link: string;
  image: string;
  rating: number;
  category: string;
  likes: number
}

export const products = [
  {
    id: 1,
    name: 'Apple Vision Pro',
    price: 2089785,
    description: 'Apple Vision Pro, революционный пространственный компьютер.',
    link: 'https://kaspi.kz/shop/p/apple-vision-pro-512-gb-116472619/?c=750000000',
    image: 'https://resources.cdn-kaspi.kz/img/m/p/h74/hf7/85118753931294.png?format=gallery-large',
    rating: 1,
    category: "gadget",
    likes:0
  },
  {
    id: 2,
    name: 'iPhone 13',
    price: 294138,
    description: 'Apple iPhone 13 получил дисплей 6.1 дюйма Super Retina XDR, который отличается невероятно высокой плотностью пикселей — фотографии, видео и текст выглядят поразительно четко.',
    link: 'https://kaspi.kz/shop/p/apple-iphone-13-128gb-midnight-chernyi-102298404/?c=750000000ps://kaspi.kz/shop/p/apple-iphone-13-mini-512gb-zelenyi-104184124/?c=750000000',
    image: 'https://resources.cdn-kaspi.kz/img/m/p/h32/h70/84378448199710.jpg?format=gallery-large',
    rating: 5,
    category: "gadget",
    likes:0
  },
  {
    id: 3,
    name: 'iPhone 15 Pro Max',
    price: 622955,
    description: 'Apple iPhone 15 Pro Max - сверхпрочный флагман, изготовленный из титана.',
    link: 'https://kaspi.kz/shop/p/apple-iphone-15-pro-max-256gb-seryi-113138420/?c=750000000',
    image: 'https://resources.cdn-kaspi.kz/img/m/p/hc1/h65/83559848181790.png?format=gallery-large',
    rating : 5,
    category: "gadget",
    likes:0
  },
  {
    id: 4,
    name: 'Apple MacBook Air 13',
    price: 409499,
    description: 'Маленький чип. Грандиозный прорыв.Первый чип, разработанный специально для Mac.',
    link: 'https://kaspi.kz/shop/p/apple-macbook-air-13-mgn63-seryi-100797845/?c=750000000',
    image: 'https://resources.cdn-kaspi.kz/img/m/p/h73/h87/63947822596126.jpg?format=gallery-large',
    rating: 4,
    category: "gadget",
    likes:0
  },
  {
    id: 5,
    name: 'iPhone 15 Pro',
    price: 548656,
    description: 'Apple iPhone 15 Pro - сверхпрочный смартфон, изготовленный из титана.',
    link: 'https://kaspi.kz/shop/p/apple-iphone-15-pro-128gb-dual-sim-belyi-114790416/?c=750000000',
    image: 'https://resources.cdn-kaspi.kz/img/m/p/h6f/h21/84557784645662.jpg?format=preview-large',
    rating: 4,
    category: "gadget",
    likes:0
  },
  {
    id: 6,
    name: 'iPhone 15',
    price: 374372,
    description: 'Apple iPhone 15 - смартфон, сочетающий в себе передовую оптику, мощный процессор, долгоиграющую батарею и запоминающийся дизайн.',
    link: 'https://kaspi.kz/shop/p/apple-iphone-15-128gb-chernyi-113137790/?c=750000000',
    image: 'https://resources.cdn-kaspi.kz/img/m/p/he2/h1d/83559338442782.png?format=gallery-large',
    rating: 5,
    category: "gadget",
    likes:0
  },
  {
    id: 7,
    name: 'Apple iPad Pro 2022',
    price: 414999,
    description: 'Изумительная производительность. Улучшенный дисплей. Сверхскоростное беспроводное соединение. Новые возможности Apple Pencil.',
    link: 'https://kaspi.kz/shop/p/apple-ipad-pro-2022-wi-fi-11-djuim-8-gb-128-gb-seryi-107276534/?c=750000000',
    image: 'https://resources.cdn-kaspi.kz/img/m/p/h15/h91/64895796412446.jpg?format=gallery-large',
    rating: 5,
    category: "gadget",
    likes:0
  },
  {
    id: 8,
    name: 'MacBook Air 13 M2',
    price: 539990,
    description: 'Обновленная в 2022 году линейка MacBook Air компании Apple, как и ранее, объединяет ультрабуки в тонком (11 мм) и легком (1.24 кг) алюминиевом корпусе.',
    link: 'https://kaspi.kz/shop/p/apple-macbook-air-13-mly33-chernyi-105933768/?c=750000000',
    image: 'https://resources.cdn-kaspi.kz/img/m/p/he6/hfd/64506820984862.jpg?format=gallery-large',
    rating: 5,
    category: "gadget",
    likes:0
  },
  {
    id: 9,
    name: 'MacBook Pro 16',
    price: 1449950,
    description: 'Феноменально производительный, ультралегкий и поистине уникальный Macbook Pro 16 M2 Pro.',
    link: 'https://kaspi.kz/shop/p/apple-macbook-pro-16-2023-mnw93-seryi-108645788/?c=750000000',
    image: 'https://resources.cdn-kaspi.kz/img/m/p/hf6/heb/68378829062174.jpg?format=preview-large',
    rating: 5,
    category: "gadget",
    likes:0
  },
  {
    id: 10,
    name: 'MacBook Pro 14',
    price: 975000,
    description: 'Маленький чип. Грандиозный прорыв. Первый чип, разработанный специально для Mac.',
    link: 'https://kaspi.kz/shop/p/apple-macbook-pro-14-2023-mphe3-seryi-108645925/?c=750000000',
    image: 'https://resources.cdn-kaspi.kz/img/m/p/hf6/h95/68379275755550.jpg?format=preview-large',
    rating: 5,
    category: "gadget",
    likes:0
  },
  {
    id:11,
    name: 'Стул N-12 Белый',
    price: 7389,
    description: "тип: стул\n" + "материал: пластик\n" +
      "обивка: отсутствует\n" +
      "жесткость сиденья: высокая\n" +
      "высота: 81.0 см\n" +
      "ширина: 50.0 см\n" +
      "глубина: 25.0 см\n" +
      "цвет: белый\n" +
      "страна: Китай",
    link: 'https://kaspi.kz/shop/p/stul-n-12-81x50x25-sm-belyi-100189414/?c=750000000',
    image: 'https://resources.cdn-kaspi.kz/img/m/p/h59/h3b/63900105277470.jpg?format=gallery-medium',
    rating: 4,
    category: 'furniture',
    likes:0
  },
  {
    id: 12,
    name:"Пижама Milana красный",
    price: 4500,
    description:'модель: пижама\n' +
      'комплектация: брюки, ,рубашка\n' +
      'состав: хлопок',
    link:'https://kaspi.kz/shop/p/pizhama-milana-250-krasnyi-m-46-108218231/?c=750000000',
    image:'https://resources.cdn-kaspi.kz/img/m/p/hca/h00/84163024420894.jpg?format=gallery-medium',
    rating:5,
    category:'clothes',
    likes:0
  },
  {
    id: 13,
    name: 'Комплект Antec черный',
    price: 10890,
    description: 'модель: комплект\n' +
      'вид спорта: универсальный\n' +
      'состав: полиэстер, ,эластан',
    link: 'https://kaspi.kz/shop/p/antec-rashgard-5-v-1-rash-921-chernyi-42-103217238/?c=750000000',
    image: 'https://resources.cdn-kaspi.kz/img/m/p/hb1/h57/82999734861854.jpg?format=gallery-medium',
    rating: 5,
    category: "clothes",
    likes:0
  },
  {
    id: 14,
    name: 'Бомбер Boni серый',
    price: 14796,
    description: 'модель: бомбер\n' +
      'сезон: демисезон, ,зима\n' +
      'состав: полиэстер, ,шерсть\n' +
      'утеплитель: холлофайбер',
    link: 'https://kaspi.kz/shop/p/bomber-boni-a144-seryi-universal-nyi-113495911/?c=750000000',
    image: 'https://resources.cdn-kaspi.kz/img/m/p/h3d/h5d/83994359463966.jpg?format=gallery-medium',
    rating: 5,
    category: "clothes",
    likes:0
  },
  {
    id: 15,
    name: 'Спецодежда для мужчин зеленый',
    price: 20300,
    description: 'сфера применения: универсальная\n' +
      'верхняя часть одежды: куртка\n' +
      'нижняя часть одежды: брюки\n' +
      'основной материал: искусственная кожа\n' +
      'сезон: демисезон',
    link: 'https://kaspi.kz/shop/p/184498-zelenyi-46-115954805/?c=750000000',
    image: 'https://resources.cdn-kaspi.kz/img/m/p/h59/h22/84937623666718.jpg?format=gallery-medium',
    rating: 4,
    category: "clothes",
    likes:0
  },
  {
    id: 16,
    name: 'Юбка трапеция черный',
    price: 4500,
    description: 'для беременных: Нет\n' +
      'длина юбки: макси\n' +
      'состав: шелк\n' +
      'застежка: резинка',
    link: 'https://kaspi.kz/shop/p/jubka-trapetsija-247661-chernyi-s-113395404/?c=750000000',
    image: 'https://resources.cdn-kaspi.kz/img/m/p/hef/haf/83872191741982.jpg?format=gallery-medium',
    rating: 5,
    category: "clothes",
    likes:0
  },
  {
    id: 17,
    name: 'Офисное кресло 18604221_Ми-6, черный',
    price: 15200,
    description: 'назначение: офисное кресло\n' +
      'тип базы: крестовина с колесами\n' +
      'материал обивки: текстиль\n' +
      'регулировка: высота сиденья\n' +
      'цвет: черный\n' +
      'страна: Китай',
    link: 'https://kaspi.kz/shop/p/ofisnoe-kreslo-18604221-mi-6-chernyi-116243941/?c=750000000',
    image: 'https://resources.cdn-kaspi.kz/img/m/p/ha9/h0e/85022513496094.jpg?format=gallery-medium',
    rating: 4,
    category: "furniture",
    likes:0
  },
  {
    id: 18,
    name: 'Sofabed.kz 648153 диван, обивка велюр',
    price: 94627,
    description: 'механизм трансформации: еврокнижка\n' +
      'обивка: велюр\n' +
      'высота: 75.0 см\n' +
      'длина: 290.0 см\n' +
      'глубина: 130.0 см\n' +
      'цвет: серый\n' +
      'страна: Казахстан',
    link: 'https://kaspi.kz/shop/p/sofabed-kz-648153-divan-obivka-veljur-75x290x130-sm-seryi-106832599/?c=750000000',
    image: 'https://resources.cdn-kaspi.kz/img/m/p/hdd/h26/64352476135454.jpg?format=gallery-medium',
    rating: 4,
    category: "furniture",
    likes:0
  },
  {
    id: 19,
    name: 'MEISHI серый',
    price: 23900,
    description: 'максимальная нагрузка: 160.0 кг\n' +
      'материал: металл\n' +
      'двуспальная: Нет\n' +
      'цвет: серый\n' +
      'страна: Китай',
    link: 'https://kaspi.kz/shop/p/meishi-seryi-110782824/?c=750000000',
    image: 'https://resources.cdn-kaspi.kz/img/m/p/h35/he5/84756891271198.jpg?format=gallery-medium',
    rating: 5,
    category: "furniture",
    likes:0
  },
  {
    id: 20,
    name: 'Компьютерный стол, 110x70x75 см см, белый',
    price: 28890,
    description: 'форма: прямоугольный\n' +
      'тип: классический\n' +
      'материал: ЛДСП, ,металл\n' +
      'длина: 110.0 см\n' +
      'ширина: 70.0 см\n' +
      'высота: 75.0 см\n' +
      'примечание: товар может поставляться в разобранном виде, по поводу сборки уточняйте у продавца\n' +
      'цвет: белый\n' +
      'страна: Казахстан',
    link: 'https://kaspi.kz/shop/p/komp-juternyi-stol-110x70x75-sm-sm-belyi-108418941/?c=750000000',
    image: 'https://resources.cdn-kaspi.kz/img/m/p/h5b/h7c/85119645319198.jpg?format=gallery-medium',
    rating: 5,
    category: "furniture",
    likes:0
  },
  {
    id: 21,
    name: 'Maxler 100% Golden Creatine 300 г',
    price: 11940,
    description: 'тип: креатин\n' +
      'форма выпуска: порошок\n' +
      'упаковка: банка',
    link: 'https://kaspi.kz/shop/p/maxler-100-golden-creatine-300-g-29502177/?c=750000000',
    image: 'https://resources.cdn-kaspi.kz/img/m/p/h63/h50/63758370701342.jpg?format=gallery-medium',
    rating: 5,
    category: "sport",
    likes:0
  },
  {
    id: 22,
    name: 'Классический термос Супермаркет Посуды 0.5 л',
    price: 1080,
    description: 'объем: 0.5 л\n' +
      'тип: классический термос\n' +
      'материал корпуса: сталь\n' +
      'материал колбы: сталь',
    link: 'https://kaspi.kz/shop/p/klassicheskii-termos-supermarket-posudy-0-5-l-987666-chernyi-103970648/?c=750000000',
    image: 'https://resources.cdn-kaspi.kz/img/m/p/h61/hd6/64355770892318.jpg?format=gallery-medium',
    rating: 5,
    category: "sport",
    likes:0
  },
  {
    id: 23,
    name: 'Эспандер для рук в наборе 123 черный',
    price: 4090,
    description: 'тип: пружинный\n' +
      'нагрузка: 60.0 кг\n' +
      'материал: резина, ,пластик, ,металл',
    link: 'https://kaspi.kz/shop/p/espander-dlja-ruk-v-nabore-123-chernyi-110262488/?c=750000000',
    image: 'https://resources.cdn-kaspi.kz/img/m/p/hd3/h7b/80669863149598.jpg?format=gallery-medium',
    rating: 3,
    category: "sport",
    likes:0
  },
  {
    id: 24,
    name: 'Cervelo S5 700 дюйм 2021 M мультиколор',
    price: 3000000,
    description: 'тип: шоссейный\n' +
      'модельный год: 2021\n' +
      'складной: Нет\n' +
      'размеры рамы: M\n' +
      'материал рамы: карбон (углепластик)',
    link: 'https://kaspi.kz/shop/p/cervelo-s5-700-djuim-2021-m-mul-tikolor-110058000/?c=750000000',
    image: 'https://resources.cdn-kaspi.kz/img/m/p/h8a/h23/80499197968414.png?format=gallery-medium',
    rating: 5,
    category: "sport",
    likes:0
  },

  {
    id: 25,
    name: 'Svensson Industrial ARMORTECH CRIMSSON GLORY',
    price: 2999990,
    description: 'складная: Нет\n' +
      'тип: электрическая\n' +
      'максимальный вес пользователя: 221.0 кг\n' +
      'ширина бегового полотна: 60.0 см',
    link: 'https://kaspi.kz/shop/p/svensson-industrial-armortech-crimsson-glory-111063589/?c=750000000',
    image: 'https://resources.cdn-kaspi.kz/img/m/p/h78/hce/81447644495902.jpg?format=gallery-medium',
    rating: 1,
    category: "sport",
    likes:0
  },


];

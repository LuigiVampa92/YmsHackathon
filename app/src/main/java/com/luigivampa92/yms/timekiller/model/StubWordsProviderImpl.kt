package com.luigivampa92.yms.timekiller.model

import java.util.*

class StubWordsProviderImpl : WordsProvider {

    val wordsArray = arrayOf("дом",
            "дым",
            "еда",
            "кот",
            "кит",
            "жар",
            "сет",
            "анх",
            "тыл",
            "йод",
            "воз",
            "фай",
            "бол",
            "чих",
            "ёрш",
            "баг",
            "ярл",
            "каг",
            "чак",
            "явь",
            "боб",
            "иже",
            "сок",
            "ток",
            "гун",
            "пук",
            "дуо",
            "мба",
            "лат",
            "кок",
            "чип",
            "вуз",
            "соя",
            "гид",
            "инь",
            "фат",
            "бай",
            "гул",
            "тян",
            "вис",
            "кон",
            "хит",
            "меч",
            "орс",
            "чви",
            "бук",
            "рег",
            "рцы",
            "дно",
            "коч",
            "пес",
            "шип",
            "лиф",
            "кум",
            "жур",
            "суд",
            "щур",
            "люд",
            "чур",
            "сун",
            "сон",
            "хет",
            "фес",
            "мем",
            "вяз",
            "шик",
            "кхо",
            "рас",
            "сев",
            "гбе",
            "пыж",
            "ять",
            "моа",
            "чек",
            "утя",
            "дей",
            "тёк",
            "дим",
            "вой",
            "туф",
            "кун",
            "вор",
            "сюр",
            "дип",
            "кег",
            "нут",
            "обр",
            "пуп",
            "лаз",
            "уош",
            "цез",
            "ела",
            "мул",
            "это",
            "фот",
            "огр",
            "раж",
            "род",
            "жук",
            "сед",
            "тут",
            "мил",
            "стол",
            "стул",
            "клон",
            "клоп",
            "апач",
            "море",
            "пуща",
            "бикс",
            "опад",
            "аньи",
            "врач",
            "луба",
            "гоби",
            "осот",
            "граб",
            "гусь",
            "лоуд",
            "пень",
            "силт",
            "маха",
            "банг",
            "букс",
            "бозо",
            "жито",
            "клот",
            "гаур",
            "сумь",
            "казу",
            "баск",
            "игбо",
            "бино",
            "вила",
            "дамп",
            "пайп",
            "плис",
            "арит",
            "русс",
            "сари",
            "йога",
            "лень",
            "реек",
            "репа",
            "жила",
            "казы",
            "мене",
            "стул",
            "град",
            "ламе",
            "обед",
            "миди",
            "нуда",
            "скот",
            "важа",
            "мако",
            "саба",
            "онса",
            "молл",
            "гилл",
            "пиоз",
            "буто",
            "зоил",
            "жбан",
            "драп",
            "полк",
            "копа",
            "лето",
            "муст",
            "силл",
            "метр",
            "звяк",
            "сбыт",
            "адыр",
            "пони",
            "рвач",
            "дард",
            "нощь",
            "альб",
            "сени",
            "колл",
            "сжим",
            "плут",
            "ринк",
            "веда",
            "ромб",
            "скет",
            "кошт",
            "имер",
            "жиго",
            "сказ",
            "керн",
            "ирит",
            "игла",
            "сета",
            "леза",
            "моси",
            "круп",
            "ирон",
            "горн",
            "ауха",
            "лайм",
            "ажур",
            "игра",
            "паром",
            "шакал",
            "принц",
            "барон",
            "порка",
            "полка",
            "жёнка",
            "индат",
            "гуари",
            "жердь",
            "бозец",
            "дымка",
            "бирка",
            "банко",
            "варяг",
            "кайса",
            "вокар",
            "даман",
            "герой",
            "виола",
            "брага",
            "авлос",
            "глайд",
            "зазор",
            "азога",
            "актер",
            "дырка",
            "гюрза",
            "зажор",
            "гунди",
            "белая",
            "ишиас",
            "живое",
            "домен",
            "илама",
            "дронт",
            "ботва",
            "архив",
            "дышло",
            "авизо",
            "ежиха",
            "дубье",
            "жатва",
            "верже",
            "букля",
            "барка",
            "возня",
            "банда",
            "голяк",
            "блажь",
            "волан",
            "дубок",
            "дойка",
            "добра",
            "икота",
            "ацена",
            "бридж",
            "бабка",
            "гавот",
            "гниль",
            "гуцул",
            "иджма",
            "ватер",
            "анаша",
            "дурро",
            "каста",
            "иолит",
            "грудь",
            "грахт",
            "глубь",
            "галка",
            "аборт",
            "бласт",
            "агент",
            "дщерь",
            "закят",
            "гамма",
            "дрожь",
            "волок",
            "гарди",
            "динод",
            "гумно",
            "булла",
            "дебит",
            "аскос",
            "гараж",
            "белец",
            "бельт",
            "гилея",
            "вихрь",
            "еноат",
            "аррип",
            "ифрит",
            "армин",
            "засов",
            "бугор",
            "дайна",
            "вуаль",
            "видик",
            "анкер",
            "бетон",
            "жетон",
            "яндекс",
            "барион",
            "фараон",
            "доклад",
            "патрон",
            "флакон",
            "октагон",
            "шершень",
            "аксакал",
            "москвич",
            "жаровня",
            "теплица",
            "алипин",
            "грабен",
            "аддукт",
            "дачник",
            "брелок",
            "водица",
            "баволе",
            "бранша",
            "биксин",
            "бракаж",
            "бариец",
            "гайдук",
            "габбро",
            "бурьян",
            "гидрид",
            "врубка",
            "байбак",
            "гораки",
            "ахенец",
            "арения",
            "авицид",
            "байрам",
            "анилид",
            "вибрам",
            "библия",
            "бандит",
            "гиппус",
            "адалин",
            "гимнел",
            "водник",
            "арысец",
            "гестоз",
            "гнеток",
            "брикет",
            "галакс",
            "гумфак",
            "генада",
            "бусидо",
            "алалия",
            "бегума",
            "вмазка",
            "вестон",
            "акабар",
            "гидрел",
            "айнгум",
            "абреже",
            "афемия",
            "вапити",
            "гайела",
            "выброс",
            "амилат",
            "биогаз",
            "ахание",
            "боярин",
            "венула",
            "атабек",
            "грызун",
            "агирия",
            "бикруг",
            "гризин",
            "выщелк",
            "аманат",
            "гермин",
            "гамаюн",
            "гопник",
            "биолин",
            "азбука",
            "боярка",
            "бармен",
            "выклев",
            "даяние",
            "вендор",
            "ваучер",
            "адипоз",
            "гривка",
            "гиттия",
            "абсент",
            "гоньба",
            "вохмяк",
            "азовец",
            "барбос",
            "выжлец",
            "гридин",
            "боевик",
            "адажио",
            "буррет",
            "бонист",
            "амозит",
            "глютин",
            "борнит",
            "гнилец",
            "вымпел",
            "вайнах",
            "биосад",
            "гигаку",
            "гермил",
            "агустит",
            "вебинар",
            "бернсит",
            "бегония",
            "антидор",
            "азоамин",
            "афоризм",
            "богомол",
            "бракета",
            "аскафус",
            "адыгеит",
            "аллоген",
            "бенинец",
            "багорок",
            "акрофит",
            "баганец",
            "бластез",
            "аэрофор",
            "буквоед",
            "аэрарий",
            "аятолла",
            "аэрофит",
            "братчик",
            "булахит",
            "акмолит",
            "ацерола",
            "бисдвиг",
            "агевзия",
            "аурацин",
            "айсшток",
            "брюшняк",
            "асьютец",
            "ветчина",
            "барышец",
            "вертиго",
            "веразин",
            "ариллус",
            "банакит",
            "аматрис",
            "белоног",
            "аспират",
            "брошюра",
            "агролог",
            "бравада",
            "афорист",
            "абугида",
            "вердикт",
            "бифенил",
            "биолакт",
            "верстак",
            "айкинит",
            "бумазея",
            "аксиома",
            "богачка",
            "атремия",
            "белость",
            "ажиотаж",
            "акинета",
            "аблыкит",
            "автозал",
            "бигамия",
            "бувигер",
            "атавизм",
            "арапник",
            "баиянка",
            "браулез",
            "аллолит",
            "ацетион",
            "альвеус",
            "биоцикл",
            "вариант",
            "авандек",
            "барбекю",
            "ангарец",
            "балабол",
            "аверроа",
            "амилоид",
            "африцит",
            "бечевая",
            "бифотон",
            "бульвар",
            "басетля",
            "артхаус",
            "батолит",
            "аллопат",
            "бенгали",
            "варение",
            "барриль",
            "бирянка",
            "алудель",
            "арианин",
            "вальтер",
            "варенье",
            "альпака",
            "аурамин",
            "блоссит",
            "ботаника",
            "автомост",
            "аксиолит",
            "бензинка",
            "апертура",
            "бостонец",
            "аневризм",
            "анальгия",
            "афелинус",
            "артродир",
            "бетоника",
            "белужина",
            "акватлон",
            "анилазин",
            "апокойну",
            "амидиний",
            "антипион",
            "брандеум",
            "аврикула",
            "автофлаг",
            "артропод",
            "акмеолог",
            "барботин",
            "биомасса",
            "брыжейка",
            "бромазид",
            "аттогерц",
            "бензамин",
            "бийчанин",
            "атлантец",
            "апулиенс",
            "аддикция",
            "актограф",
            "брожение",
            "бортпаёк",
            "автовесы",
            "берлинец",
            "бехтерец",
            "алатырец",
            "берегиня",
            "боезаряд",
            "бобовник",
            "антилопа",
            "аэромант",
            "акинезия",
            "апостема",
            "биспинор",
            "белофинн",
            "близость",
            "аустенит",
            "борчанка",
            "аланинат",
            "агедония",
            "азаринин",
            "богослов",
            "берборит",
            "актиноид",
            "альголит",
            "астериск",
            "айдырлит",
            "автопуть",
            "абзетцер",
            "бишкекец",
            "аникония",
            "биотомия",
            "агрипния",
            "автотрек",
            "биацетил",
            "берёзник",
            "бразилид",
            "бейслайн",
            "агиделец",
            "бабочник",
            "антифаза",
            "аураптен",
            "аллергия",
            "авиамаяк",
            "абаканец",
            "алкадиен",
            "бластема",
            "апобелок",
            "алармизм",
            "акулёнок",
            "апрессин",
            "боспорец",
            "алуноген",
            "берестка",
            "бретонец",
            "бастонит",
            "братанье",
            "альпинид",
            "атакамит",
            "акатизия",
            "антрацен",
            "бисмутит",
            "анонимия"
    )

    val random = Random(Date().time)

    override fun getWordByLetterCount(count: Int): String {
        val filteredArray = wordsArray.filter { it.length == count }
        val targetSize = filteredArray.size
        val word = if (targetSize != 0) filteredArray[random.nextInt(targetSize)] else "армагеддон"
        return word

    }
}
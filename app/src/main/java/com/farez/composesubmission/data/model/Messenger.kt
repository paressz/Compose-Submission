package com.farez.composesubmission.data.model

data class Messenger(val id: String, val name: String, val desc: String, val url:String)

object MessengerList {
    val messengerList = listOf(
        Messenger("1",
            "Whatsapp",
            "Aplikasi ini merupakan aplikasi chatting yang paling banyak digunakan di Indonesia",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/6/6b/WhatsApp.svg/512px-WhatsApp.svg.png"),
        Messenger(
            "2",
            "Telegram",
            "Aplikasi buatan messenger kedua terbaik, aplikasi ini memiliki bot buatan penggunanya yang memiliki beragam fitur yang berguna",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/8/82/Telegram_logo.svg/512px-Telegram_logo.svg.png"
        ),
        Messenger("3",
        "Facebook Messenger",
        "Aplikasi yang dibuat untuk oleh META ini terpaksa digunakan oleh para pengguna facebook yang ingin melakukan percakapan dengan temannya",
        "https://upload.wikimedia.org/wikipedia/commons/thumb/b/be/Facebook_Messenger_logo_2020.svg/512px-Facebook_Messenger_logo_2020.svg.png"),
        Messenger("4",
        "Line",
        "Aplikasi yang dibuat oleh Naver ini merupakan aplikasi chatting yang populer di kalangan anak muda pada masanya",
        "https://upload.wikimedia.org/wikipedia/commons/thumb/4/41/LINE_logo.svg/320px-LINE_logo.svg.png"),
        Messenger("5",
        "Kakao Talk",
        "Aplikasi yang dibuat oleh Kakao Corp, dirilis berbarengan pada saat line dirilis di indonesia, memiliki fitur yang mirip dengan line namun kalah populer",
        "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e3/KakaoTalk_logo.svg/600px-KakaoTalk_logo.svg.png"),
        Messenger("6",
        "Signal",
        "Aplikasi yang messenger yang mengutamakan privasi ini dibuat oleh Elon Musk pada saat privasi menjadi kekhawatiran",
        "https://upload.wikimedia.org/wikipedia/commons/thumb/8/8d/Signal-Logo.svg/600px-Signal-Logo.svg.png"),
        Messenger("7",
        "Viber",
        "Aplikasi messenger buatan Viber Media S.a.r.l. yang sudah ada lebih dulu sebelum whatsapp populer di Indonesia, namun aplikasi ini hampir tidak memiliki pengguna di Indonesia",
        "https://banner2.cleanpng.com/20180517/ygq/kisspng-viber-ipa-app-store-viber-5afd6e8b8461f7.8113383215265583475422.jpg"),
        Messenger("8",
            "Mystic Messenger",
            "Aplikasi yang merupakan sebuah game ini dibuat untuk ornag-orang kesepian untuk chatting dengan karakter fiksi yang memiliki tampang rupawan yang ada di dalam game",
            "https://w7.pngwing.com/pngs/571/554/png-transparent-mystic-messenger-chat-room-online-chat-game-visual-novel-mystic-messenger-thumbnail.png"),
        Messenger("9",
            "WeChat",
            "Aplikasi yang pada saat itu dirilis untuk menejadi saingan Kakao Talk dan Line namun kini aplikasi ini sudha tidak ada lagi di play store indonesia ",
            "https://seeklogo.com/images/W/wechat-logo-C88C575BE0-seeklogo.com.png"),
        Messenger("10",
            "MiChat",
            "Aplikasi super powerfull yang dapat membawa kepuasan langsung kepada penggunanya walaupun harus merogoh kantong cukup mahal",
            "https://i.pinimg.com/736x/9a/c7/7e/9ac77ed57a967f10a8ff8c6dcd6e0308.jpg"),

    )
}

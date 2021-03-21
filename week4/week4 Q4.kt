import android.media.session.MediaSession

/**
4. What is Coroutines? Why we use it? Try to explain in Mandarin.*/
/**若有程式在執行時需要稍長的工作時間而造成其他延遲執行，
則可以使用coroutines去判斷，先執行其他程式，
待延遲時間完畢後再回傅原本的程式以提高使用效率*/

//網路資料
//允許 method 被暫停( suspended)執行之後再回復(resumed)執行，
//而暫停執行的 method 狀態允許被保留，復原後再以暫停時的狀態繼續執行。


/*
suspend fun getToken(): MediaSession.Token { ...... }

suspend fun verify(token, userName: String): Boolean { ...... }

suspend fun requestAndSaveUserData(userName: String): Result { ...... }

fun login(userName: String) {
    GlobalScope.launch {
        try {
            val token = getToken()
            val isLogin = verify(token, userName)
            if (isLogin) {
                val success = requestAndSaveUserData(userName)
                if (success) {
                    showLoginSuccess("Success")
                }
            }
            ......
        }
    }
}
在 Main thread 執行到一個耗時的 getToken() 時，由於需要等待 IO thread 的結果，所以先暫停 getToken() ，
讓出 Main thread 去做其他的事，等到 IO thread 執行完畢後，再重新繼續 getToken() ，
而這種控制 function 的 "暫停" -> "繼續" 的狀態切換，就是 Coroutines 實際上在做的事。*/

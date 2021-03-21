/**
2. Here are the 7 important lifecycle methods of an Activity
i. onCreate()
ii. onStart()
iii. onResume()
iv. onPause()
v. onStop()
vi. onDestroy()
Try to explain when are they called during the lifecycle of Activity.
 */

/*onCreate :*/
/*kt 檔產生時都會有這個週期的片段在其中，此週期在開啟應用程式時會是第一*/個進入的流程，並且在應用程式週期中，
/*也只會執行這一次，之前的範例中會拿來宣告物件監聽，例如按鈕的點擊動作。*/

/*onStart :*/
/*負責將 activity 頁面可視化，並將 UI 物件初始化以便讓使用者互動，這些動作完成後，就會跳至 onResume 方法。*/

/*onResume :*/
/*這時期應用程式處於持續執行中，且一直與使用者互動著，直到使用者的焦點移轉，*/
/*例如：切換到另一個 Activity 頁面，或是開啟其它應用程式 (有人來電)，此時就會進入 onPause 暫停的狀態。*/

/**
onPause ： 觸發時，可以將你的應用程式做一些特別的動作，例如偵測到有人來電，音樂撥放器就將音樂暫停，
如果選擇拒接(在通知列拒接而非開啟電話 App 拒接)，就會再回到 onResume 階段；
但若接起電話，開啟了電話 App或回到主畫面、開啟其他的 App，就會進入 onStop 階段。*/

/**
 * onStop ： 可設計將手機的資源釋放出來，讓給使用者進行其它操作使用，例如在 onStop 方法中將 BroadcastReceiver 釋放掉，
如原本用來撰寫監聽網路連線狀態，並會在畫面上提示使用者，但是現在使用者已經不再關注於本應用程式中，
就沒有必要繼續占用資源，這是 Memory Management 的概念。
有其它優先權更高的應用程式執行，並且手機的資源不夠 (記憶體)，就會將本應用程式處理階段清除掉，釋放資源，等到使用者回來就會從 onCreate 全新的開始。
表資源充足的情況下，使用者做完其它事情再度回到本應用程式時，就會進入 onRestart 接續 OnStart > OnResume 一系列流程。*/

/**
onDestroy : 除了使用者終止應用程式就會觸發這個流程外，Android 作業系統也可能會因為系統資源極度缺乏的情況下，
自動終止在 onStop 或 onPause 狀態的應用程式。*/


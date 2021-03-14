/**4. What are the ​differences​ between ​LinearLayout​ and ​RelativeLayout​? Try to explain in details.*/
//LinearLayout用垂直水平去定義物件的位子
//RelativeLayout 物件對物件去定義物件的位子


/** LinearLayout(線性排序） */
/*字面意義來說LinearLayout可稱為線性Layout，在LinearLayout內的元件皆以水平(horizontal)或垂直(vertical)排列，在使用之前，
可先定義其「orientation」屬性，可設定值為「horizontal」水平或「vertical」垂直。但不管是一行（列）只能存在一個元件
也可以在LinearLayout中再塞一個LinearLayout，其顯示方式則會因為塞在水平或垂直中有所不同，如下
優先權的判斷:
若是 水平排列, 則 layout_width = 數值 > layout_weight (需搭配 layout_width = WRAP_CONTENT)
若是 垂直排列, 則 layout_height= 數值 > layout_weight (需搭配 layout_height= WRAP_CONTENT)
另外該屬性值預設為 0, 也就是不會自動分配.*/
/*<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
xmlns:tools="http://schemas.android.com/tools"
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:orientation="vertical"
android:paddingLeft="@dimen/activity_horizontal_margin">

<Button
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:text="Button 1"/>
<Button
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:text="Button 2"/>
<Button
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:text="Button 3"/>

<LinearLayout 這邊再塞一組
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:orientation="horizontal">

<Button
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:text="Button 4"/>
<Button
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:text="Button 5"/>
</LinearLayout>

<Button
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:text="Button 6"/>

</LinearLayout>*/

/** relativeLayout（相對位子）*/

/*網路資料
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
android:layout_width="match_parent"
android:layout_height="match_parent">

<TextView
android:id="@+id/one"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:text="one!"
android:textSize="20sp" />

<TextView
android:id="@+id/two"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_toRightOf="@+id/one"  //此元件在one的右方
android:text="two!"
android:textSize="20sp" />

<TextView
android:id="@+id/three"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_toRightOf="@+id/two"
android:layout_marginLeft="50dp"
android:text="three!"
android:textSize="20sp" />

<TextView
android:id="@+id/four"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_centerInParent="true"
android:text="four!"
android:textSize="20sp" />

<TextView
android:id="@+id/five"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_centerHorizontal="true"
android:layout_alignParentBottom="true"
android:text="five!"
android:textSize="20sp" />

<TextView
android:id="@+id/six"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_alignTop="@+id/five"
android:text="six!"
android:textSize="25sp" />

</RelativeLayout>
 */

/*網路資料
relativeLayout 對其指令
屬性	說明
android:id	  該屬性指定一個辨識符號給元件，並自動在R.java中建立索引，透過此id可用來調用元件.
android:layout_width	  該屬性定義元件的寬度，可使用的屬性值有"fill_parent"(填滿容器空間)、
"wrap_content"(根據內部內容延展至適當大小)、"match_parent"(大致上  功能與"fill_parent"相同，2.2版本才可使用).

android:layout_height	  該屬性定義元件的高度，可使用屬性值同上.
android:text	  該屬性可設定文字顯示在元件上.
android:layout_above	  將此元件置於"指定元件"(使用元件id指定)上方.
android:layout_below	  將此元件置於"指定元件"(使用元件id指定)下方.
android:layout_toLeftOf	  將此元件置於"指定元件"(使用元件id指定)左方.
android:layout_toRightOf	  將此元件置於"指定元件"(使用元件id指定)右方.
android:layout_alignParentTop	  將此元件對齊於佈局畫面上邊線，屬性值為true、false.
android:layout_alignParentRight	  將此元件對齊於佈局畫面右邊線，屬性值為true、false.
android:layout_alignParentLeft     	  將此元件對齊於佈局畫面左邊線，屬性值為true、false.
android:layout_alignParentBottom	  將此元件對齊於佈局畫面底線，屬性值為true、false.
android:layout_centerHorizontal
將該元件水平居中於整個布局畫面，屬性值為true、false

android:layout_centerVertical	  將該元件垂直居中於整個布局畫面，屬性值為true、false
android:layout_centerInParent	  將該元件水平及垂直均居中於整個布局畫面，屬性值為true、false
android:layout_marginBottom	  將該元件離布局畫面底邊多少距離，屬性質為具體的像數值，如10dp、10px
android:layout_marginLeft	  將該元件離布局畫面左邊多少距離，屬性質為具體的像數值，如10dp、10px
android:layout_marginRight	  將該元件離布局畫面右邊多少距離，屬性質為具體的像數值，如10dp、10px
android:layout_marginTop	  將該元件離布局畫面上邊多少距離，屬性質為具體的像數值，如10dp、10px
android:layout_alignParentBottom	  將該元件對齊布局畫面的底邊，屬性值為true、false
android:layout_alignParentLeft	  將該元件對齊布局畫面的左邊，屬性值為true、false
android:layout_alignParentRight	  將該元件對齊布局畫面的右邊，屬性值為true、false
android:layout_alignParentTop	  將該元件對齊布局畫面的上邊，，屬性值為true、false*/

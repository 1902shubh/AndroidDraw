
# Android Draw
A drawing view for your android application							

![Screenshot_20240920_201037](https://github.com/user-attachments/assets/89341740-a10c-40d5-885a-43492cd729a4)

### Download

For information : checkout [Sample App Code](https://github.com/1902shubh/AndroidDraw/tree/master/app) in repository.

## Dependency

*Step 1*. Add the JitPack repository to your build file

Add it in your root setting.gradle at the end of repositories:

```gradle
allprojects {
		repositories {
			...
           maven(url = "https://jitpack.io")
		}
	}
  ```
  
  
*Step 2*. Add the dependency

```gradle
	dependencies {
	        implementation("com.github.1902shubh:AndroidDraw:1.0.9")
	}
  
  ```
## Usage

There are two ways to use this library.

### 1. Use Activity

You can call the `Drawing Activity` using `startActivityForResult` which will return you bitmap in byteArray. By using this method you will have all the features like change strokeWidth, change strokeColor, change Alpha, erase, redo, undo.

```kotlin
val intent = Intent(this, DrawingActivity::class.java)
startActivityForResult(intent, REQUEST_CODE_DRAW)

// Get bitmap in onActivityResult
override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (data != null && resultCode == Activity.RESULT_OK) {
            when(requestCode){
                REQUEST_CODE_DRAW -> {
                    val result= data.getByteArrayExtra("bitmap")
                    val bitmap = BitmapFactory.decodeByteArray(result, 0, result.size)
                    saveImage(bitmap)
                }
            }
        }
    }
```
### 2.Use DrawView

#### Declaration
```xml
<com.papayacoders.draw.widget.DrawView
        android:id="@+id/draw_view"
        android:layout_width="match_parent"
        android:layout_height="match_parent" />
```

- To clear canvas
```
draw_view.clearCanvas()
```
- To set stroke width
```kotlin
// takes input as Float
draw_view.setStrokeWidth(strokeWidth)
```
- To set stroke alpha
```kotlin
// takes input as Int
draw_view.setAlpha(progress)
```
- To set stroke color
```
draw_view.setColor(color)
```
- To undo
```
draw_view.undo()
```

- To redo
```
draw_view.redo()
```

## Connect
- [Twitter](https://twitter.com/papayacoders)
- [Youtube](https://youtube.com/papayacoders)
- [LinkedIn](https://www.linkedin.com/in/1902shubh/)


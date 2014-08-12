Android-picasso Library
=========================


https://github.com/square/picasso  原始链接。

关键代码：
1. listview的图片获取：
com.example.picasso.SampleListDetailAdapter.java
 Picasso.with(context)
        .load(url)
        .placeholder(R.drawable.placeholder)
        .error(R.drawable.error)
        .resizeDimen(R.dimen.list_detail_image_size, R.dimen.list_detail_image_size)
        .centerInside()
        .into(holder.image);

2. 显示详细页面的图片：
com.example.picasso.SampleListDetailActivity.java

 Picasso.with(activity)
          .load(url)
          .fit()
          .into(imageView);
          
3. 通知栏的消息：
com.example.picasso.PicassoSampleAdapter.java
 Picasso.with(activity) //
            .load(Data.URLS[new Random().nextInt(Data.URLS.length)]) //
            .resizeDimen(R.dimen.notification_icon_width_height,
                R.dimen.notification_icon_width_height) //
            .into(remoteViews, R.id.photo, NOTIFICATION_ID, notification);

4. 主菜单的列表：
com.example.picasso.PicassoSampleAdapter.java

5. 去系统Gallery获取图片显示：
com.example.picasso.SampleGalleryActivity.java
 Picasso.with(this).load(image).into(imageView, new EmptyCallback() {
      @Override public void onSuccess() {
        // Index 0 is the image view.
        animator.setDisplayedChild(0);
      }
    });

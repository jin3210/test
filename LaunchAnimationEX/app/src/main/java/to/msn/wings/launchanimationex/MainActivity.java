package to.msn.wings.launchanimationex;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;

//自作アクティビティ
public class MainActivity extends Activity {
    private final static int MP = ViewGroup.LayoutParams.MATCH_PARENT;

    //アクティビティ起動時に呼ばれる
    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        //レイアウトの生成
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        setContentView(layout);

        //イメージビューの生成
        ImageView imageView = new ImageView(this);
        imageView.setImageBitmap(res2bmp(this,R.drawable.arino));
        imageView.setLayoutParams(new LinearLayout.LayoutParams(MP, MP));
        layout.addView(imageView);
    }

    //リソース→ビットマップ
    public static Bitmap res2bmp(Context context, int resID) {
        return BitmapFactory.decodeResource(
                context.getResources(), resID);
    }
}
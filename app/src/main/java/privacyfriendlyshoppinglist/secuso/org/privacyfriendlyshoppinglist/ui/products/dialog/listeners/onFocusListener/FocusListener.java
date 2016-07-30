package privacyfriendlyshoppinglist.secuso.org.privacyfriendlyshoppinglist.ui.products.dialog.listeners.onFocusListener;

import android.view.View;
import privacyfriendlyshoppinglist.secuso.org.privacyfriendlyshoppinglist.R;
import privacyfriendlyshoppinglist.secuso.org.privacyfriendlyshoppinglist.ui.products.dialog.ProductDialogCache;

/**
 * Created by Chris on 30.07.2016.
 */
public class FocusListener implements View.OnFocusChangeListener
{
    private ProductDialogCache dialogCache;

    public FocusListener(ProductDialogCache cache)
    {
        this.dialogCache = cache;
    }


    @Override
    public void onFocusChange(View view, boolean hasFocus)
    {
        if ( hasFocus )
        {
            dialogCache.getExpandableLayout().setVisibility(View.GONE);
            dialogCache.getExpandableImageView().setImageResource(R.drawable.expander_ic_minimized);
        }
    }
}

package org.holoeverywhere.demo.fragments.lists;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AbsListView;

import org.holoeverywhere.demo.R;
import org.holoeverywhere.widget.ArrayAdapter;
import org.holoeverywhere.widget.ListView;

public class ListsChoiceModeMultiplueFragment extends ListsBaseFragment {
    private ListView mList;

    @Override
    protected CharSequence getTitle() {
        return "Lists: Choice mode: Multiplue";
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        menu.clear();
        inflater.inflate(R.menu.lists_choice_mode_mulitplue, menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.inverse:
                final int count = mList.getCount();
                for (int i = 0; i < count; i++) {
                    mList.setItemChecked(i, !mList.isItemChecked(i));
                }
                break;
            default:
                return super.onOptionsItemSelected(menuItem);
        }
        return true;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setHasOptionsMenu(true);
        mList = getListView();
        mList.setChoiceMode(AbsListView.CHOICE_MODE_MULTIPLE);
        setListAdapter(ArrayAdapter.createFromResource(getActivity(), R.array.some_words,
                R.layout.simple_list_item_multiple_choice));
    }
}

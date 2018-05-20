package cl.vicentepc.shrinkquizz;

import android.support.design.widget.TabItem;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 * Pone el placeholder fargment 3 veces en el activity
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }
    /*Se encarga de poner el elemento*/
    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:
                return PartyFragment.newInstance();
            case 1:
                return MatchFragment.newInstance();
            case 2:
                return LuckyFragment.newInstance();
            default:
                return PartyFragment.newInstance();
        }
    }

    /*Retorna la cantidad de paginas que deseamos mostrar*/
    @Override
    public int getCount() {
        // Show 3 total pages.
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position){
        switch(position){
            case 0:
                return "Party";
            case 1:
                return "Match";
            case 2:
                return "Lucky";
        }
        return null;
    }
}

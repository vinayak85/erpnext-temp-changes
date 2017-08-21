/*Date Fragment Dialog Interface Listener*/
implements DatePickerFragment.DateDialogListener

/*Implements Fragment Dialog Interface Listener*/
@Override
    public void onFinishDialog(Date date) {
        //SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String hireDate = sdf.format(date);
        //Toast.makeText(this, "Selected Date :"+ formatDate(date), Toast.LENGTH_SHORT).show();
        select_date2.setText(hireDate);
        Load_Objective(select_date2.getText().toString());
        //Toast.makeText(getContext(),"Selected Date :"+ hireDate, Toast.LENGTH_SHORT).show();
    }

/*Call Method show_dialog_for_select_date() Onclick Textview....*/
@Override
    public void onStart() {
select_date1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    show_dialog_for_select_date();
                }
            });
            select_date2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    show_dialog_for_select_date();
                }
            });
            select_date3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    show_dialog_for_select_date();
                }
            });
}


/*Method: Call Date Fragment Dialog*/
private void show_dialog_for_select_date() {

        try {

            DatePickerFragment dialog = new DatePickerFragment();
            dialog.setTargetFragment(fragment_objective_list.this, 300);
            dialog.show(getFragmentManager(), "fdf");

            //DatePickerFragment dialog = new DatePickerFragment();
            //dialog.show(getSupportFragmentManager(), DIALOG_DATE);

           /*user_list_hierarchy_FragmentDialog dialog = user_list_hierarchy_FragmentDialog.newInstance("Hello world");
            final Bundle bundle = new Bundle();
            bundle.putString("stcokiest", "N");
            dialog.setArguments(bundle);
            dialog.setTargetFragment(fragment_objective_list.this, 300);
            dialog.show(getFragmentManager(), "fdf");*/
        } catch (Exception ex) {
            Toast.makeText(getContext(), ex.getMessage().toString(), Toast.LENGTH_SHORT).show();
        }
    }

public X1 onCreateViewHolder (ViewGroup parent, int viewType) {

    Log.d (TAG, "><![CDATA[>onCreateViewHolder(parent=" + parent + ", viewType=" + viewType + ")");

    X1 result;

    switch (viewType) {

        case ID_VIEW_HOLDER_ACTUAL :

            {

                View itemView = LayoutInflater.from (parent.getContext ()).inflate (R.layout.card_layout_actual, parent, false);

                result = new ViewHolderActual (itemView, new ViewHolderActual.IViewHolderClick () {

                    @Override

                    public void onCardClick (View view, int position, X1 viewHolder) {

                        Log.d (TAG, "><![CDATA[<onCardClick(view=" + view + ", position=" + position + ", viewHolder=" + viewHolder + ")");

                        Intent intent = new Intent (view.getContext (), OrderDetailActivity.class);

                        intent.putExtra (OrderDetailActivity.ARG_ORDER_ID, viewHolder.getOrderId ());

                        view.getContext ().startActivity (intent);

                    }@Override

                    public void onButtonClick (Button button, int position, X1 viewHolder) {

                        Log.d (TAG, "><![CDATA[<onButtonClick(button=" + button + ", position=" + position + ", viewHolder=" + viewHolder + ")");

                        Intent intent = new Intent (button.getContext (), OrderMapActivity.class);

                        intent.putExtra (OrderMapActivity.ARG_ORDER_ID, viewHolder.getOrderId ());

                        button.getContext ().startActivity (intent);

                    }}

                );

                break;

            } case ID_VIEW_HOLDER :

        default :

            {

                View itemView = LayoutInflater.from (parent.getContext ()).inflate (R.layout.card_layout, parent, false);

                result = new X1 (itemView, new X1.IViewHolderClick () {

                    @Override

                    public void onCardClick (View view, int position, X1 viewHolder) {

                        Log.d (TAG, "><![CDATA[<onCardClick(view=" + view + ", position=" + position + ", viewHolder=" + viewHolder + ")");

                        Intent intent = new Intent (view.getContext (), OrderDetailActivity.class);

                        intent.putExtra (OrderDetailActivity.ARG_ORDER_ID, viewHolder.getOrderId ());

                        view.getContext ().startActivity (intent);

                    }}

                );

                break;

            }}

    Log.d (TAG, "<<onCreateViewHolder(parent=" + parent + ", viewType=" + viewType + ")= " + result);

    return result;

}

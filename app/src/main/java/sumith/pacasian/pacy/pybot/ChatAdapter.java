package sumith.pacasian.pacy.pybot;

import android.app.Activity;
import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;


import java.util.ArrayList;


public class ChatAdapter extends BaseAdapter {
    private static LayoutInflater inflater = null;
    ArrayList<ChatData> chatMessageList;
    Context mContext;

    public ChatAdapter(Activity activity, ArrayList<ChatData> list) {
        mContext = activity;
        chatMessageList = list;
        inflater = (LayoutInflater) activity
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    public void add(ChatData object) {
        chatMessageList.add(object);
    }

    @Override
    public int getCount() {
        return chatMessageList.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ChatData message = (ChatData) chatMessageList.get(position);
        View vi = convertView;
        if (convertView == null)
            vi = inflater.inflate(R.layout.chatrow, null);


        TextView msg = (TextView) vi.findViewById(R.id.txtMessage);

        msg.setText(message.body);
        LinearLayout layout = (LinearLayout) vi
                .findViewById(R.id.message_layout);
        LinearLayout parent_layout = (LinearLayout) vi
                .findViewById(R.id.message_layout_parent);

        // if message is mine then align to rightreceive_msg.xml
        //send_msg.xml
        if (message.isMine) {
            layout.setGravity(Gravity.RIGHT);
            msg.setBackgroundResource(R.drawable.ic_send);
            parent_layout.setGravity(Gravity.RIGHT);
        }
        // If not mine then align to left
        else {
            layout.setGravity(Gravity.LEFT);
            msg.setBackgroundResource(R.drawable.ic_receive);
            parent_layout.setGravity(Gravity.LEFT);
        }
        return vi;
    }
}
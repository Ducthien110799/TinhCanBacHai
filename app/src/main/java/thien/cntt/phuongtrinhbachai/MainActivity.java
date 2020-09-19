package thien.cntt.phuongtrinhbachai;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnTinhtoan;

    private EditText txtA;
    private EditText txtB;
    private EditText txtC;

    private int a,b,c;
    private double delta,x1,x2;
    private TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        setEventClickView();
    }
    public void init(){
        txtResult = (TextView) findViewById(R.id.txtResult);

        btnTinhtoan = (Button) findViewById(R.id.btnTinhtoan);

        txtA = (EditText) findViewById(R.id.edtA);
        txtB = (EditText) findViewById(R.id.edtB);
        txtC = (EditText) findViewById(R.id.edtC);
    }

    public  void setEventClickView(){
        btnTinhtoan.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        txtResult.setText("");

        a = Integer.parseInt(txtA.getText().toString());
        b = Integer.parseInt(txtC.getText().toString());
        c = Integer.parseInt(txtC.getText().toString());
        if(a==0){
            if(b==0){
                if(c==0)
                    txtResult.append("Phuong trinh vo so nghiem");
                else
                    txtResult.append("Phuong trinh vo nghiem");
            }
            else
                txtResult.append("x = "+(-c/b));
        }
        else{
            delta=b*b-4*a*c;
            if(delta <= 0)
                txtResult.append("Phuong trinh vo nghiem");
            else {
                x1= (-b-Math.sqrt(delta))/2*a;
                x1= (-b+Math.sqrt(delta))/2*a;
                txtResult.append("x1= "+x1+", x2= "+x2);
            }
        }

    }
}
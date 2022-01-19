public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openActivity2();
                }
            });
        }
        public void openActivity2() {
            Intent intent = new Intent(this, SecondActivity.class);
            startActivity(intent);
        }
    }

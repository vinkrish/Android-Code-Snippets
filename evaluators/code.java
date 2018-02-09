public class MainActivity extends AppCompatActivity {

    private ImageView imageView;

    private RelativeLayout relativeLayout;

    int ctr = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);

        relativeLayout = (RelativeLayout) findViewById(R.id.rlayout);

        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator anim;

                if(ctr %2 == 0){
                    anim = ObjectAnimator.ofObject(relativeLayout, "backgroundColor", new ArgbEvaluator(),
                            Color.GREEN, Color.RED);

                }else{

                    anim = ObjectAnimator.ofObject(relativeLayout, "backgroundColor", new ArgbEvaluator(),
                            Color.RED, Color.GREEN);
                }

                anim.setDuration(2000);
                anim.start();
                ctr++;

            }
        });

    }
}
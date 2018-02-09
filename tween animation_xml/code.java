//Activity
private ImageView mImageView;

private Animation mRotateAnim;
private Animation mScaleAnim;
private Animation mTranslateAnim;
private Animation mAlphaAnim;

public void scaleAnimation(View view) {
    mScaleAnim = AnimationUtils.loadAnimation(this, R.anim.scale_anim);
    mScaleAnim.setAnimationListener(this);
    mImageView.startAnimation(mScaleAnim);
}

public void translateAnimation(View view) {
    mTranslateAnim = AnimationUtils.loadAnimation(this, R.anim.translate_anim);
    mTranslateAnim.setAnimationListener(this);
    mImageView.startAnimation(mTranslateAnim);
}

public void alphaAnimation(View view) {
    mAlphaAnim = AnimationUtils.loadAnimation(this, R.anim.alpha_anim);
    mAlphaAnim.setAnimationListener(this);
    mImageView.startAnimation(mAlphaAnim);
}

public void rotateAnimation(View view) {
    mRotateAnim = AnimationUtils.loadAnimation(this, R.anim.rotate_anim);
    mRotateAnim.setAnimationListener(this);
    mImageView.startAnimation(mRotateAnim);
}
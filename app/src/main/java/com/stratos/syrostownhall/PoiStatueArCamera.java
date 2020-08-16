package com.stratos.syrostownhall;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;

import com.google.ar.core.Anchor;
import com.google.ar.core.AugmentedImage;
import com.google.ar.core.Frame;
import com.google.ar.core.TrackingState;
import com.google.ar.sceneform.AnchorNode;
import com.google.ar.sceneform.FrameTime;
import com.google.ar.sceneform.Scene;
import com.google.ar.sceneform.math.Vector3;
import com.google.ar.sceneform.rendering.ExternalTexture;
import com.google.ar.sceneform.rendering.ViewRenderable;
import com.google.ar.sceneform.ux.ArFragment;

import java.util.Collection;
import java.util.Objects;

public class PoiStatueArCamera extends AppCompatActivity {

    private ExternalTexture texture;
    private ImageView imageView;
    private ArFragment arFragment;
    private Scene scene;
    private ViewRenderable renderable;
    private boolean isImageDetected = false;

    public PoiStatueArCamera(ExternalTexture texture, ImageView imageView) {
        this.texture = texture;
        this.imageView = imageView;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poi_statue_ar_camera);



        ViewRenderable
                .builder()
                .setSource(this, Uri.parse("statue.jpg"))
                .build()
                .thenAccept(ViewRenderable -> {
                    ImageView imageView = (ImageView)renderable.getView();

                    renderable = ViewRenderable;
                });

        arFragment = (com.stratos.syrostownhall.CustomArFragment2)getSupportFragmentManager().findFragmentById(R.id.arFragment);

        if (arFragment != null) {
            scene = arFragment.getArSceneView().getScene();
        }

        scene.addOnUpdateListener(this::onUpdate);

    }

    private void onUpdate(FrameTime frameTime) {

        if (isImageDetected)
            return;

        Frame frame = arFragment.getArSceneView().getArFrame();

        Collection<AugmentedImage> augmentedImages =
                frame != null ? frame.getUpdatedTrackables(AugmentedImage.class) : null;


        for (AugmentedImage statue : Objects.requireNonNull(augmentedImages)) {
            if (statue.getTrackingState() == TrackingState.TRACKING) {

                if (statue.getName().equals("statue")) {

                    isImageDetected = true;

                    createDisplayContext(statue.createAnchor(statue.getCenterPose()), statue.getExtentX(),
                            statue.getExtentZ());

                    break;
                }

            }
        }

    }

    private void createDisplayContext(Anchor anchor, float extentX, float extentZ) {
        AnchorNode anchorNode = new AnchorNode(anchor);

        texture.getSurfaceTexture().setOnFrameAvailableListener(surfaceTexture -> {
            anchorNode.setRenderable(renderable);
            texture.getSurfaceTexture().setOnFrameAvailableListener(null);
    });

        anchorNode.setWorldScale(new Vector3(extentX, 1f, extentZ));

        scene.addChild(anchorNode);

    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, HomeActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);

    }
}
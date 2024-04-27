package kz.sd.shop.adapters;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0001:\u0002\u0017\u0018B\u0005\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u000f\u001a\u00020\u00072\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001c\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0012H\u0016R(\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR(\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000b\u00a8\u0006\u0019"}, d2 = {"Lkz/sd/shop/adapters/CartAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lkz/sd/shop/models/Product;", "Lkz/sd/shop/base/BaseProductViewHolder;", "()V", "deleteButtonClicked", "Lkotlin/Function1;", "", "getDeleteButtonClicked", "()Lkotlin/jvm/functions/Function1;", "setDeleteButtonClicked", "(Lkotlin/jvm/functions/Function1;)V", "itemClick", "getItemClick", "setItemClick", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ProductDiffUtils", "ProductViewHolder", "app_debug"})
public final class CartAdapter extends androidx.recyclerview.widget.ListAdapter<kz.sd.shop.models.Product, kz.sd.shop.base.BaseProductViewHolder<?>> {
    @org.jetbrains.annotations.Nullable
    private kotlin.jvm.functions.Function1<? super kz.sd.shop.models.Product, kotlin.Unit> itemClick;
    @org.jetbrains.annotations.Nullable
    private kotlin.jvm.functions.Function1<? super kz.sd.shop.models.Product, kotlin.Unit> deleteButtonClicked;
    
    public CartAdapter() {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable
    public final kotlin.jvm.functions.Function1<kz.sd.shop.models.Product, kotlin.Unit> getItemClick() {
        return null;
    }
    
    public final void setItemClick(@org.jetbrains.annotations.Nullable
    kotlin.jvm.functions.Function1<? super kz.sd.shop.models.Product, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final kotlin.jvm.functions.Function1<kz.sd.shop.models.Product, kotlin.Unit> getDeleteButtonClicked() {
        return null;
    }
    
    public final void setDeleteButtonClicked(@org.jetbrains.annotations.Nullable
    kotlin.jvm.functions.Function1<? super kz.sd.shop.models.Product, kotlin.Unit> p0) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public kz.sd.shop.base.BaseProductViewHolder<?> onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    kz.sd.shop.base.BaseProductViewHolder<?> holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lkz/sd/shop/adapters/CartAdapter$ProductDiffUtils;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lkz/sd/shop/models/Product;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    public static final class ProductDiffUtils extends androidx.recyclerview.widget.DiffUtil.ItemCallback<kz.sd.shop.models.Product> {
        
        public ProductDiffUtils() {
            super();
        }
        
        @java.lang.Override
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull
        kz.sd.shop.models.Product oldItem, @org.jetbrains.annotations.NotNull
        kz.sd.shop.models.Product newItem) {
            return false;
        }
        
        @java.lang.Override
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull
        kz.sd.shop.models.Product oldItem, @org.jetbrains.annotations.NotNull
        kz.sd.shop.models.Product newItem) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\t"}, d2 = {"Lkz/sd/shop/adapters/CartAdapter$ProductViewHolder;", "Lkz/sd/shop/base/BaseProductViewHolder;", "Lkz/sd/shop/databinding/ItemCartBinding;", "binding", "(Lkz/sd/shop/adapters/CartAdapter;Lkz/sd/shop/databinding/ItemCartBinding;)V", "bindView", "", "item", "Lkz/sd/shop/models/Product;", "app_debug"})
    public final class ProductViewHolder extends kz.sd.shop.base.BaseProductViewHolder<kz.sd.shop.databinding.ItemCartBinding> {
        
        public ProductViewHolder(@org.jetbrains.annotations.NotNull
        kz.sd.shop.databinding.ItemCartBinding binding) {
            super(null);
        }
        
        @java.lang.Override
        public void bindView(@org.jetbrains.annotations.NotNull
        kz.sd.shop.models.Product item) {
        }
    }
}
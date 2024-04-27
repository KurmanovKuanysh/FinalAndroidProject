package kz.sd.shop.base;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\u0004\b\u0001\u0010\u00032\u00020\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0006J\u0015\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00028\u0001H&\u00a2\u0006\u0002\u0010\rR\u0016\u0010\u0005\u001a\u00028\u0000X\u0094\u0004\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u000e"}, d2 = {"Lkz/sd/shop/base/BaseViewHolder;", "VB", "Landroidx/viewbinding/ViewBinding;", "T", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "(Landroidx/viewbinding/ViewBinding;)V", "getBinding", "()Landroidx/viewbinding/ViewBinding;", "Landroidx/viewbinding/ViewBinding;", "bindView", "", "item", "(Ljava/lang/Object;)V", "app_debug"})
public abstract class BaseViewHolder<VB extends androidx.viewbinding.ViewBinding, T extends java.lang.Object> extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
    @org.jetbrains.annotations.NotNull
    private final VB binding = null;
    
    public BaseViewHolder(@org.jetbrains.annotations.NotNull
    VB binding) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    protected VB getBinding() {
        return null;
    }
    
    public abstract void bindView(T item);
}
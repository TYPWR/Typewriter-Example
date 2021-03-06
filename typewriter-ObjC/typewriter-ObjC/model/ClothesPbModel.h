//
//  ClothesPbModel.h
//  Autogenerated by typewriter
//
//  Generation Date On 2018/01/08
//  Version: 1.0.0

#import "TypewriterBaseModel.h"

@class ClothesPb;

NS_ASSUME_NONNULL_BEGIN

@interface ClothesPbModel : TypewriterBaseModel<NSObject>
@property (nonatomic, readwrite, copy, nullable) NSString *objectId;
@property (nonatomic, readwrite, copy) NSString *type;
@property (nonatomic, readwrite, assign) UInt32 price;
@property (nonatomic, readwrite, copy) NSString *brand;
+ (nullable instancetype)modelWithClothesPb:(ClothesPb *)prototype objectId:(nullable NSString *)objectId;
- (nullable instancetype)initWithClothesPb:(ClothesPb *)prototype objectId:(nullable NSString *)objectId;
@end

@interface ClothesPbModel (Extension)
+ (void)unidirectionalDataflow:(ClothesPbModel *)model objectId:(NSString *)objectId;
@end

NS_ASSUME_NONNULL_END
